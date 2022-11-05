@echo off
::compile src files and run application
mkdir bin
javac -d  ./bin/ ./src/*.java
java -classpath ./bin/; Main