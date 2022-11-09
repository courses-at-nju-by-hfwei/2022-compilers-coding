grammar SimpleExpr;

import SimpleExprLex;

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