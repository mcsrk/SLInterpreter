grammar SL;

s : declaration |
		'programa' id declaration  ;

declaration : 'const' dec_constants |
		'inicio' main_program |
		'tipos' dec_types |
		'var' dec_variables  ;

dec_constants : id '=' constant_literal constants_statement_terminator dec_constants_continue  ;

dec_constants_continue : declaration |
		id '=' constant_literal constants_statement_terminator dec_constants_continue  ;

constants_statement_terminator : ';' |
		  ;

dec_variables : id dec_variable_separator dec_variables_continue  ;

dec_variables_continue : id dec_variable_separator dec_variables_continue |
		declaration  ;

dec_types : id ':' structured_type types_statement_terminator dec_types_continue  ;

dec_types_continue : declaration |
		id ':' structured_type types_statement_terminator dec_types_continue  ;

types_statement_terminator : ';' |
		  ;

dec_variable_separator : ':' structured_type var_statement_terminator |
		',' id dec_variable_separator  ;

var_statement_terminator : ';' |
		  ;

type : 'cadena' |
		id |
		register |
		'numerico' |
		'logico'  ;

register : 'registro' '{' register_data  ;

register_data : id register_var structured_type register_data |
		'}'  ;

register_var : ':' |
		',' id register_var  ;

structured_type : vector_type type |
		type |
		matrix_type type  ;

vector_type : 'vector' '[' vector_index_size ']'  ;

matrix_type : 'matriz' '[' matrix_index_size  ;

vector_index_size : '*' |
		tk_numero |
		id  ;

matrix_index_size : vector_index_size ',' vector_index_size matrix_index_separator  ;

matrix_index_separator : ']' |
		',' vector_index_size matrix_index_separator  ;

main_program : 'fin' routine |
		main_sentence main_program_statement_terminator main_program  ;

main_program_statement_terminator :  |
		';'  ;

main_sentence : from |
		assign |
		if_stat |
		function_call |
		while_stat |
		until |
		eval  ;

routine :  |
		'subrutina' routine_signature |
		EOF  ;

routine_declaration : 'var' routine_dec_variables routine_declaration |
		'const' routine_dec_constants routine_declaration |
		'inicio' routine_program |
		'tipos' routine_dec_types routine_declaration  ;

routine_dec_constants : id '=' constant_literal constants_statement_terminator routine_dec_constants_continue  ;

routine_dec_constants_continue : routine_declaration |
		id '=' constant_literal constants_statement_terminator routine_dec_constants_continue  ;

routine_dec_variables : id dec_variable_separator routine_dec_variables_continue  ;

routine_dec_variables_continue : id dec_variable_separator routine_dec_variables_continue |
		routine_declaration  ;

routine_dec_types : id ':' structured_type types_statement_terminator routine_dec_types_continue  ;

routine_dec_types_continue : id ':' structured_type types_statement_terminator routine_dec_types_continue |
		routine_declaration  ;

routine_signature : id '(' routine_parameters ')' routine_return_type  ;

routine_parameters :  |
		routine_parameter  ;

routine_return_type : 'retorna' structured_type routine_declaration |
		routine_declaration  ;

routine_parameter : routine_param routine_parameter_separator |
		'ref' routine_param routine_parameter_separator  ;

routine_parameter_separator : ':' structured_type routine_parameter_separator |
		 |
		routine_parameter |
		';' routine_parameter  ;

routine_param : id routine_param_separtor  ;

routine_param_separtor :  |
		',' routine_param  ;

routine_program : 'fin' routine |
		routine_sentence routine_statement_terminator routine_program |
		'retorna' '(' p_exp ')' 'fin' routine  ;

routine_statement_terminator : ';' |
		  ;

routine_sentence : while_stat |
		function_call |
		until |
		eval |
		from |
		assign |
		if_stat  ;

if_stat : 'si' condition '{' if_program  ;

if_program : main_sentence if_statement_terminator if_program |
		'}' |
		'sino' else_if  ;

if_statement_terminator :  |
		';'  ;

else_if : else_program |
		'si' condition else_if_program  ;

else_if_program : 'sino' else_if |
		main_sentence else_if_statement_terminator else_if_program |
		'}'  ;

else_if_statement_terminator :  |
		';'  ;

else_sentence : eval |
		from |
		assign |
		function_call |
		while_stat |
		until  ;

else_program : else_sentence else_statement_terminator else_program_mid |
		'}'  ;

else_program_mid : '}' |
		main_sentence else_mid_statement_terminator else_program_mid  ;

else_statement_terminator :  |
		';'  ;

else_mid_statement_terminator : ';' |
		  ;

eval : 'eval' '{' eval_cases  ;

eval_cases : 'sino' eval_else_program |
		'caso' condition eval_case_statement_terminator eval_program |
		'}'  ;

eval_case_statement_terminator :  |
		';'  ;

eval_else_program : main_sentence eval_else_statement_terminator eval_else_program |
		'}'  ;

eval_else_statement_terminator :  |
		';'  ;

eval_program : main_sentence eval_statement_terminator eval_program |
		eval_cases  ;

eval_statement_terminator :  |
		';'  ;

while_stat : 'mientras' condition rep_body  ;

until : 'repetir' until_program  ;

until_program : main_sentence until_statement_terminator until_program |
		'hasta' condition  ;

until_statement_terminator :  |
		';'  ;

from : 'desde' id '=' p_exp 'hasta' p_exp from_step  ;

from_step : rep_body |
		'paso' p_exp rep_body  ;

rep_body : '{' rep_body_program  ;

rep_body_program : main_sentence rep_statement_terminator rep_body_program |
		'}'  ;

rep_statement_terminator :  |
		';'  ;

p_exp : term op_term  ;

op_term :  |
		op term op_term  ;

term : '(' p_exp ')' |
		id_f |
		literal |
		unop term |
		'{' vector_value '}'  ;

id_f : id id_complement |
		func '(' parameter  ;

id_complement :  |
		'.' id id_extraction |
		'(' parameter |
		'[' p_exp vec_sep ']' id_extraction  ;

id_extraction : '.' id id_extraction |
		'[' p_exp vec_sep ']' id_extraction |
		  ;

parameter : ')' |
		param  ;

param : p_exp p_sep  ;

p_sep : ')' |
		',' param  ;

assign : id id_complement id_exp  ;

prog_exp : id id_complement op_term |
		t op_term  ;

id_exp :  |
		'=' prog_exp  ;

t : literal |
		'(' p_exp ')' |
		func '(' parameter |
		unop unop_operand |
		'{' vector_value '}'  ;

unop_operand : id id_complement |
		t  ;

function_call : func '(' parameter  ;

vec_sep :  |
		',' p_exp vec_sep  ;

condition : '(' p_exp ')'  ;

vector_value : vector_literal vector_sep  ;

vector_literal : 'true' |
		id |
		'{' vector_value '}' |
		 |
		tk_numero |
		TK_CADENA |
		'false'  ;

vector_sep :  |
		',' vector_value  ;

literal : TK_CADENA |
		tk_numero |
		'true' |
		'false'  ;

constant_literal : unop literal |
		literal  ;

unop : '+' |
		'-' |
		'not'  ;

op : '<' |
		'<>' |
		'-' |
		'<=' |
		'/' |
		'+' |
		'%' |
		'==' |
		'*' |
		'>' |
		'and' |
		'^' |
		'>=' |
		'or'  ;

func : 'paramval' |
		'pcount' |
		'pos' |
		'dim' |
		'random' |
		'imprimir' |
		'sec' |
		'cls' |
		'set_stdin' |
		'leer' |
		'set_stdout' |
		'set_ifs' |
		'sin' |
		'abs' |
		'sqrt' |
		'arctan' |
		'str' |
		'ascii' |
		'strdup' |
		'cos' |
		'strlen' |
		'dec' |
		'substr' |
		'eof' |
		'tan' |
		'exp' |
		'upper' |
		'get_ifs' |
		'val' |
		'inc' |
		'alen' |
		'int' |
		'log' |
		'lower' |
		'mem' |
		'ord'  ;

id : ID;
ID : [a-zA-Z][a-zA-Z0-9_]* ;

TK_CADENA : ["'] (~["'])* ["'] ;

tk_numero : FLOAT_EXP | FLOAT | INTEGER_EXP | INTEGER;

FLOAT_EXP : [0-9]+ '.' [0-9]+ [eE] [+-]? [0-9]+ ;

FLOAT : [0-9]+ '.' [0-9]+;

INTEGER_EXP : [0-9]+ [eE] [0-9]+ ;

INTEGER : [0-9]+;

COMMENT : '/*' .*? '*/' -> skip ;

LINE_COMMENT : '//' ~[\r\n]* -> skip ;

WS : [ \t\r\n]+ -> skip ;