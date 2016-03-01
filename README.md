# SimpleLang

Keith Herbert

**A language grammar based on a provided language description/examples with an interpreter implemented with ANTLR as a single grammar file.**

## Grammar

### Syntax Rules
 ```
    program     ->  {statement}
    statement   ->  declareInt
                    | declareString
                    | declareInferred
                    | assignment
                    | print
                    | NEWLINE

    declareInt      ->  'var' ID {, ID} 'int' ['=' expression] NEWLINE  
    declareString   ->  'var' ID {, ID} 'string' ['=' expression] NEWLINE
    declareInferred ->  ID ':=' (STRING|INT) NEWLINE

    assignment  ->  ID '=' expression NEWLINE
    expression  ->  expression
                    |   '(' expression ')'
                    |   expression OPERATOR expression
                    |   STRING
                    |   INT      

    

 ```
### Lexical Rules
 ```
    ID -> LETTER{CHAR}
    INT -> '-'?[1-9][0-9]*
    NEWLINE -> '\r'?'\n'
    OPERATOR -> ('*' | '/' | '+' | '-')
    TYPE -> 'int' | 'string'
    STRING -> '"'[ a-zA-Z0-9]*'"'
 ```

## Interpreter
