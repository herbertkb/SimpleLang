#!/bin/bash

# specify full path to ANTLR4 jar file
ANTLR="antlr-4.5.2-complete.jar"

echo "generating parser from SimpleLang.g4"
java -cp $ANTLR org.antlr.v4.Tool SimpleLang.g4

echo "compiling parser and lexer"
javac -cp $ANTLR *.java

echo "SimpleLang is running. Enter statements. Finish with EOF or CTRL-D"
java org.antlr.v4.gui.TestRig SimpleLang program
