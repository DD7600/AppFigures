#!/bin/bash 
#compile src files and run application
mkdir bin &&  javac -d  ./bin/ ./src/Main.java Window.java ScreenSize.java Dessin.java ChoiceShape.java ChoiceColor.java && java -classpath .\bin\; Main
