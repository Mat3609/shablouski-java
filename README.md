# Shablouski_Java

Run from the command line from the working directory:

javac -encoding utf8 -sourcepath D:\Shablouski_Java\src\main\java -d bin D:\Shablouski_Java\src\main\java\Main.java

java -classpath D:\shablouski-java\bin Main ibm866

OR
==

mvn compile

mvn exec:java -Dencoding=ibm866 -Dexec.mainClass="Main"





