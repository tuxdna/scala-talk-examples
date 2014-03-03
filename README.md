# Scala Examples

## Requirements

Install Scala and SBT


 * [Scala Installation](http://www.scala-lang.org/download/)
 * [SBT Setup](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html)


## Standalone programs in Scala

`hello/` contains two examples to create standalone Scala programs


## SBT project with sample code

`proj/` contains a Scala + Java project, built using SBT

To build:

    cd proj/
	sbt compile
	
To run any code

	sbt run-main Hello
	
You may also generate an eclipse project, and import it into Eclipse

    sbt eclipse
	

