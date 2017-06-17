all: flex cup test compile	
	java -classpath java-cup-11b.jar:. test hepial1
compile: sym.java parser.java Lexer.java
	javac -classpath java-cup-11b.jar:. sym.java
	javac -classpath java-cup-11b.jar:. parser.java
	javac -classpath java-cup-11b.jar:. Lexer.java	
test: test.java
	javac -classpath java-cup-11b.jar:. test.java -Xlint:deprecation

cup: moncup.cup
	java -jar java-cup-11b.jar moncup.cup

flex: monflexcup.flex
	jflex monflexcup.flex
clean:
	rm *.class Lexer.java sym.java parser.java
