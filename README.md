# SimpleLang

Keith Herbert

**A language grammar based on a provided language description/examples with an interpreter implemented with ANTLR as a single grammar file.**

## Grammar

### Syntax Rules
 ```
    program     ->  statement*
    statement   ->  declareInt
                    | declareString
                    | declareInferred
                    | assignment
                    | print
                    | NEWLINE

    declareInt      ->  'var' ID {, ID} 'int' ['=' expression] NEWLINE  
    declareString   ->  'var' ID {, ID} 'string' ['=' expression] NEWLINE
    declareInferred ->  ID ':=' (INT|STRING) NEWLINE

    assignment  ->  ID '=' expression NEWLINE
    
    print       ->  'print' expression NEWLINE
    
    expression  ->  '(' expression ')'
                    |   expression OPERATOR expression
                    |   ID
                    |   STRING
                    |   INT      

    

 ```
### Lexical Rules
 ```
    ID -> [a-zA-Z][a-zA-Z0-9]*
    INT -> '-'?[1-9][0-9]*
    NEWLINE -> '\r'?'\n'
    OPERATOR -> ('*' | '/' | '+' | '-')
    TYPE -> 'int' | 'string'
    STRING -> '"'[ a-zA-Z0-9]*'"'
 ```

## Interpreter

Simply run the provided shell scipt to begin. Finish input with CTRL+D.

    $ ./run.sh
    generating parser from SimpleLang.g4
    compiling parser and lexer
    SimpleLang is running. Enter statements. Finish with EOF or CTRL-D
    a = 1
    b = "hello"
    c := b + 1
    print c

    ello

    

