import java.util.*;

public class SLLangVisitor<T> extends SLBaseVisitor<T>{
    HashMap<String,Object> table = new HashMap<>();

    @Override public T visitRegister_members(SLParser.Register_membersContext ctx) {
        if (ctx.structured_type() != null) {
            var reg = (RegisterType) visitRegister_members(ctx.register_members());
            for (String id : (List<String>) visitId_list(ctx.id_list())) {
                reg.addMember(id, visitStructured_type(ctx.structured_type()));
            }
            return (T) reg;
        }

        return (T) new RegisterType("");
    }

    @Override public T visitType(SLParser.TypeContext ctx) {
        if (ctx.id() != null) {
            return (T) ctx.id().getText();
        } else if (ctx.register() != null) {
            return visitRegister(ctx.register());
        }
        return (T) ctx.getText();
    }

    @Override public T visitVector_index_size(SLParser.Vector_index_sizeContext ctx) {
        return ctx.getText().equals("*") ? (T) new Integer(0) : visitChildren(ctx);
    }

    @Override public T visitMatrix_index_list(SLParser.Matrix_index_listContext ctx) {
        var list = (List) ctx.matrix_index_list_cont();
        list.add(visitVector_index_size(ctx.vector_index_size()));
        return (T) list;
    }

    @Override public T visitMatrix_index_list_cont(SLParser.Matrix_index_list_contContext ctx) {
        if (ctx.matrix_index_list_cont() == null) {
            return (T) new ArrayList();
        }
        var list = (List) ctx.matrix_index_list_cont();
        list.add(visitVector_index_size(ctx.vector_index_size()));
        return (T) list;
    }

    @Override public T visitStructured_type(SLParser.Structured_typeContext ctx) {
        if (ctx.vector_index_size() != null) {
            return (T) new VectorType((Integer) visitVector_index_size(ctx.vector_index_size()), visitType(ctx.type()));
        } else if (ctx.matrix_index_list() != null) {
            return (T) new MatrixType((List<Integer>) visitMatrix_index_list(ctx.matrix_index_list()), visitType(ctx.type()));
        }
        return visitType(ctx.type());
    }

    @Override public T visitId_list(SLParser.Id_listContext ctx) {
        var list = (List) visitId_list_cont(ctx.id_list_cont());
        list.add(ctx.id().getText());
        return (T) list;
    }

    @Override public T visitId_list_cont(SLParser.Id_list_contContext ctx) {
        if (ctx.id_list_cont() == null) {
            return (T) new ArrayList();
        }
        var list = (List) ctx.id_list_cont();
        list.add(ctx.id().getText());
        return (T) list;
    }

    @Override public T visitDec_variables(SLParser.Dec_variablesContext ctx) {
        for (String id : (List<String>) visitId_list(ctx.id_list())) {
            table.put(id, new Variable<>(visitStructured_type(ctx.structured_type())));
        }
        return visitDec_variables_continue(ctx.dec_variables_continue());
    }

    @Override public T visitDec_constants(SLParser.Dec_constantsContext ctx) {
        table.put(ctx.id().getText(), visitConstant_literal(ctx.constant_literal()));
        return visitDec_constants_continue(ctx.dec_constants_continue());
    }

    @Override public T visitTk_numero(SLParser.Tk_numeroContext ctx) {
        if (ctx.FLOAT() != null) {
            return (T) new Float(ctx.INTEGER().getText());
        } else if (ctx.FLOAT_EXP() != null) {
            return (T) new Float(ctx.INTEGER().getText());
        } else if (ctx.INTEGER_EXP() != null) {
            return (T) new Integer(ctx.INTEGER().getText());
        }
        return (T) new Integer(ctx.INTEGER().getText());
    }

    @Override public T visitLiteral(SLParser.LiteralContext ctx) {
        if (ctx.TK_CADENA() != null) {
            return (T) ctx.TK_CADENA().getText().substring(1, ctx.TK_CADENA().getText().length() - 2);
        } else if (ctx.tk_numero() != null) {
            return visitTk_numero(ctx.tk_numero());
        }
        return (T) new Boolean(ctx.getText());
    }

    @Override public T visitConstant_literal(SLParser.Constant_literalContext ctx) {
        if (ctx.unop() != null) {
            var op = ctx.unop().getText();
            var value = visitLiteral(ctx.literal());
            if (op.equals("-")) {
                if (value instanceof Double) {
                    var num = ((Double) value);
                    num *= -1;
                    return (T) num;
                } else if (value instanceof Integer) {
                    var num = ((Integer) value);
                    num *= -1;
                    return (T) num;
                }
            } else if (op.equals("not")){
                if (value instanceof Boolean) {
                    var num = ((Boolean) value);
                    num = !num;
                    return (T) num;
                }
            } else {
                return value;
            }
        }
        return visitLiteral(ctx.literal());
    }
}
