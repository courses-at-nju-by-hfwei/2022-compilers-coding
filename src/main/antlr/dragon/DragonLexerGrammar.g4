lexer grammar DragonLexerGrammar;

@header {
package dragon;
}

WS : [ \t\r\n]+ -> skip;

IF : 'if' ;
ELSE : 'else' ;
ID : LETTER (LETTER | DIGIT)* ;

INT : DIGITS ;

EQ : '=' ;
NE : '<>' ;
LT : '<' ;
LE : '<=' ;
QT : '>' ;
QE : '>=' ;

DOT : '.' ;
POS : '+' ;
NEG : '-' ;


fragment DIGIT :  [0-9] ;
fragment DIGITS : [0-9]+ ;
fragment LETTER : [a-zA-Z] ;