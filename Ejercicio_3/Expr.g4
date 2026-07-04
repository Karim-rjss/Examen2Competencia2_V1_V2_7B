lexer grammar Expr;

//root : expr EOF;

ABIERO : '<' -> pushMode(INSIDE);
ABIERTO_SLASH : '</' -> pushMode(INSIDE);
XML : '<?' -> pushMode(INSIDE);
COMENTARIO : '<!--' .*? '-->';
CDATA : '<![CDATA[' .*? ']]>';
ENTIDAD : '&' .*?;
TEXTO : ~[<&]+;

mode INSIDE;
ID : [a-zA-Z_:][a-zA-Z0-9_.:-]*;
STRING : '"' ~["\r\n]* '"';
IGUAL : '=';
CERRADO : '>' -> popMode;
CERRADO_SLASH : '/>' -> popMode;
XML_CERRADO : '?>' -> popMode;

WS : [ \t\r\n]+ -> skip;