grammar SimpleExpr;

//import SimpleExprLex;

@header {
package simpleexpr;
}

// *: 0 or more
prog : stat* EOF ;

// 'if': literal
stat : expr ';'
     | ID '=' expr ';'
     | 'if' expr ';'
     ;

// | : or
// (): subrule
expr : expr ('*'|'/') expr
     | expr ('+'|'-') expr
     | ID
     | INT
     ;

SEMI : ';' ;
ASSIGN : '=' ;
IF : 'if' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

ID : (LETTER |'_') (LETTER | DIGIT | '_')* ;

INT : '0' | ([1-9] [0-9]*) ;

WS : [ \t\r\n]+ -> skip ;

SL_COMMENT : '//' .*? '\n' -> skip ;
ML_COMMENT : '/*' .*? '*/' -> skip ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
