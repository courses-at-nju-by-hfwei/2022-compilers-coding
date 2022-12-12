grammar CSVAG;

@header {
package ag;
import java.util.*;
}

file : hdr row+ ;
hdr : row ;
row : field (',' field)* '\r'? '\n' ;

field : ID | NUMBER ;

ID : [a-z]+ ;
NUMBER : [0-9]+ ;
WS : [ \t]+ -> skip;