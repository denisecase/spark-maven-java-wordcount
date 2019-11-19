# spark-maven-java-word-count

## Links

- [Article](https://www.journaldev.com/20342/apache-spark-example-word-count-program-java)
- [Maven POM](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html#Minimal_POM)
- [Maven Tutorial](https://www.baeldung.com/maven)

## Commands

Open a Bash shell and run to generate a project from the quickstart archetype:

```Bash
mvn archetype:generate -DgroupId=com.journaldev.sparkdemo -DartifactId=JD-Spark-WordCount -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Edit POM.xml, code, and add a textfile.

Edit as indicated in the article.

```Bash
mvn dependency:tree
```

## Java clean

From the VS Code menu, select View / Command Palette. Type java clean.

As needed

```Bash
mvn clean
mvn compile
```

## Run the file with Maven

```Bash
mvn exec:java -Dexec.mainClass=com.journaldev.sparkdemo.WordCounter -Dexec.args="input.txt"
```

Delete the output folder before re-running.
