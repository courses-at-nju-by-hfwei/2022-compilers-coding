grammar ExprAG;

@header {
package ag;
import java.util.*;
}

@parser::members {
  Map<String, Integer> memory = new HashMap<>();

  int eval(int left, int right, int op) {
    switch (op) {
      case ADD : return left + right;
      case SUB : return left - right;
      case MUL : return left * right;
      case DIV : return left / right;
      default : return 0;
    }
  }
}

stat : expr NEWLINE
     | ID '=' expr NEWLINE
     | NEWLINE
     ;

expr
    : left = expr op = ('*' | '/') right = expr
    | left = expr op = ('+' | '-') right = expr
    | '(' expr ')'
    | ID
    | INT
    ;

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

ID : [a-z] ;
INT : [0-9] ;
NEWLINE : [\r\n] ;
WS : [ \t\r\n] -> skip;