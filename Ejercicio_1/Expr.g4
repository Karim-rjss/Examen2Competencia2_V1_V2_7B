grammar Expr;

root: expr EOF;

expr: EOF;

// Palabras reservadas
PUBLIC : 'public';
CLASS : 'class';
STATIC : 'static';
VOID : 'void';

// Datos primitivos
STRING : 'String';
INT : 'int';
DOUBLE : 'double';
BOOLEAN : 'Boolean';
ARRAY : 'Array';

// Variables de tipo
OBJ : 'objetos';
SCANNER : 'Scanner';

// Ciclos, getters, setters
GET : 'get';
SET : 'set';
FOR : 'for';
WHILE : 'while';
DO : 'do';
IF : 'if';
ELSE : 'else';

// Cadenas
ID : [a-zA-Z_][a-zA-Z0-9_]+;
NUM : [0-9]+;
CADENA : '"' ~["\r\n]* '"';

// Operadores
MAS : '+';
MENOS : '-';
MAYOR : '>';
MENOR : '<';
MAYOR_IGUAL : '>=';
MENOR_IGUAL : '<=';
POR : '*';
ENTRE : '/';
IGUAL : '=';

// Delimitadores
LLAVE_IZQ : '{';
LLAVE_DER : '}';
CORCH_IZQ : '[';
CORCH_DER : ']';
PAR_IZQ : '(';
PAR_DER : ')';
PUNTO : '.';
PUNTO_COMA : ';';

WS : [ \t\r\n]+ -> skip;