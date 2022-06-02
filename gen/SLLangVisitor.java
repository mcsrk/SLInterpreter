import java.util.HashMap;

public class SLLangVisitor<T> extends SLBaseVisitor<T>{
    HashMap<String,Object> table = new HashMap<>();

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
