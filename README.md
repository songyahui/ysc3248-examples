# YSC3248 examples

Yale-NUS College

Examples from the Lectures on Parallel, Concurrent and Distributed Programming (YSC3248)

## Building and Running

### Requirements 

* [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Scala Build Tool](https://www.scala-sbt.org/), `sbt` (version >=1.1.6)
* [Scala](https://www.scala-lang.org/download/) (version >= 2.12.6) - to run the standalone artifact

### Building and Testing the Project

To compile and run the entire test suite (and see some cool synthesis results), execute the following command in the terminal from the root folder of the project:

```
sbt test
```

To execute a sample script, run

```
sbt "runMain basic.HelloWorld"
```