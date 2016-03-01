/** SimpleLang.g4
*   Keith Herbert
*   See README.md for BNF grammar and instructions for use.
*   Design adapted from Chapter 10 of The Definitive ANTLR4 Reference, 2nd Ed.
*/

grammar SimpleLang;

@header {
    import java.util.HashMap;
}

@members {
    Map<String, Object> symbolTable = new HashMap<String, Object>();
    
    int evaluate(String operator, int left, int right) {
        switch ( operator ) {
            case '*' : return left * right;
            case '/' : return left / right;
            case '+' : return left + right;
            case '-' : return left - right;
        }
    }
    
    String evaluate(String operator, String s, int i) {
        switch (operator) {
            case '*' : return ;
            case '/' : return s; // TODO: throw error 
            case '+' : return substring(s, i);
            case '-' : return substring(s, i * -1);
        }
    }
    
    String substring(String s, int i) {
        if (i > 0) {
            return s.substring(i);
        }
        else {
            i *= -1;
            return s.substring(0, s.length() - i);
        }
    }
}

// Syntax Rules with Embedded Semanitc Attributes
program: (statement NEWLINE)* EOF;

statement:  declareInt
        |   declareString
        |   declareInferred
        |   assignment
        |   print
        |   NEWLINE
        ;


declareInt: 'var' ID (',' ID)* 'int'    ('=' expression)? 
            {symbolTable.put($ID.text, $expression.value);}
            ;
            
declareString:  'var' ID (',' ID)* 'string' ('=' expression)? 
            {symbolTable.put($ID.text, $expression.value);}
            ;
            
declareInferred: ID ':=' expression 
            { 
                if (String.isAssignableFrom($expression.value)) {
                    symbolTable.put($ID, $expression.text);
                }
                else {
                    symbolTable.put($ID, Integer.valueOf($expression.text));
                }
            }
            ;

assignment: ID '=' expression ;

print:  'print' expression
        { System.out.println($expression.value); }
        ;

expression returns [Object value] : 
            '(' expression ')' 
                { $value = $expression.value; }
            |   expression OPERATOR expression
                { $value = evaluate($OPERATOR.text $expression.value);}
                
            |   ID     { $value = symbolTable.get($ID.text); } 
            |   STRING { $value = $STRING.text; }
            |   INT    { $value = $INT.int;     }
            ;

  
// Lexical Rules 
ID  :   [a-zA-Z][a-zA-Z0-9]*    ;
INT :   '-'?[0-9]+              ;
OPERATOR: ('*'|'/'|'+'|'-')     ;
NEWLINE : '\r'?'\n'             ;
STRING  : '"' [ a-zA-Z0-9]* '"' ;  
WS      : [ \t]+ -> skip        ; 
