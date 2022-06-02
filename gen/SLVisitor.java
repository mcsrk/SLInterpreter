// Generated from /Users/ahuertas/sl-interpreter/grammar/SL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SLParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SLParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dec_constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_constants(SLParser.Dec_constantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dec_constants_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_constants_continue(SLParser.Dec_constants_continueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#constants_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants_statement_terminator(SLParser.Constants_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dec_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_variables(SLParser.Dec_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dec_variables_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_variables_continue(SLParser.Dec_variables_continueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dec_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_types(SLParser.Dec_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dec_types_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_types_continue(SLParser.Dec_types_continueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#types_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes_statement_terminator(SLParser.Types_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#dec_variable_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_variable_separator(SLParser.Dec_variable_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#var_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_statement_terminator(SLParser.Var_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(SLParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#register_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_data(SLParser.Register_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#register_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_var(SLParser.Register_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#structured_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructured_type(SLParser.Structured_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#vector_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_type(SLParser.Vector_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#matrix_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_type(SLParser.Matrix_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#vector_index_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_index_size(SLParser.Vector_index_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#matrix_index_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_index_size(SLParser.Matrix_index_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#matrix_index_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_index_separator(SLParser.Matrix_index_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#main_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_program(SLParser.Main_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#main_program_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_program_statement_terminator(SLParser.Main_program_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#main_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_sentence(SLParser.Main_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine(SLParser.RoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_declaration(SLParser.Routine_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_dec_constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_dec_constants(SLParser.Routine_dec_constantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_dec_constants_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_dec_constants_continue(SLParser.Routine_dec_constants_continueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_dec_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_dec_variables(SLParser.Routine_dec_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_dec_variables_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_dec_variables_continue(SLParser.Routine_dec_variables_continueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_dec_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_dec_types(SLParser.Routine_dec_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_dec_types_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_dec_types_continue(SLParser.Routine_dec_types_continueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_signature(SLParser.Routine_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_parameters(SLParser.Routine_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_return_type(SLParser.Routine_return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_parameter(SLParser.Routine_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_parameter_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_parameter_separator(SLParser.Routine_parameter_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_param(SLParser.Routine_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_param_separtor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_param_separtor(SLParser.Routine_param_separtorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_program(SLParser.Routine_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_statement_terminator(SLParser.Routine_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#routine_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_sentence(SLParser.Routine_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(SLParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#if_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_program(SLParser.If_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#if_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement_terminator(SLParser.If_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(SLParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#else_if_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_program(SLParser.Else_if_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#else_if_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_statement_terminator(SLParser.Else_if_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#else_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_sentence(SLParser.Else_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#else_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_program(SLParser.Else_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#else_program_mid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_program_mid(SLParser.Else_program_midContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#else_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement_terminator(SLParser.Else_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#else_mid_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_mid_statement_terminator(SLParser.Else_mid_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(SLParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#eval_cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_cases(SLParser.Eval_casesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#eval_case_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_case_statement_terminator(SLParser.Eval_case_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#eval_else_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_else_program(SLParser.Eval_else_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#eval_else_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_else_statement_terminator(SLParser.Eval_else_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#eval_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_program(SLParser.Eval_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#eval_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_statement_terminator(SLParser.Eval_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(SLParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil(SLParser.UntilContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#until_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_program(SLParser.Until_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#until_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_statement_terminator(SLParser.Until_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(SLParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#from_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_step(SLParser.From_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#rep_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep_body(SLParser.Rep_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#rep_body_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep_body_program(SLParser.Rep_body_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#rep_statement_terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep_statement_terminator(SLParser.Rep_statement_terminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#p_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_exp(SLParser.P_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#op_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_term(SLParser.Op_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SLParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#id_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_f(SLParser.Id_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#id_complement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_complement(SLParser.Id_complementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#id_extraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_extraction(SLParser.Id_extractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SLParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#p_sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_sep(SLParser.P_sepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#prog_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_exp(SLParser.Prog_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#id_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_exp(SLParser.Id_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(SLParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#unop_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop_operand(SLParser.Unop_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(SLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#vec_sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVec_sep(SLParser.Vec_sepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#vector_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_value(SLParser.Vector_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#vector_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_literal(SLParser.Vector_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#vector_sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_sep(SLParser.Vector_sepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#constant_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_literal(SLParser.Constant_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#unop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop(SLParser.UnopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SLParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(SLParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLParser#tk_numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTk_numero(SLParser.Tk_numeroContext ctx);
}