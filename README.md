# Java Ant project

Example of how to configure a java project only with ant + ivy for install dependencies

## How to use

You'll need apache ant installed on your system

install ivy
``` sh
ant ivy
```

install dependencies ( in this example I installed json-b dependencies)
``` sh
ant install
```
this will download all required .jar files in the lib/default folder 
( you'll probably have to add this path in your lib project folder in your IDE)
Additionally you can also add a .jar file manually to the folder and the project will recognize it when compile it

Generate .class files inside `classes` directory
``` sh
ant compile
```

Generate fat .jar (executable .jar file with all the dependencies contained) inside `target` directory
``` sh
ant jar
```

run the jar file
``` sh
java -jar dist/${file-name}.jar
```
```

## Tech stack

- Java 17
- Apache Ant
- Apache Ivy


## License
MIT
