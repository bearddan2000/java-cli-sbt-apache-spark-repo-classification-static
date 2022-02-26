lazy val root = (project in file("."))
  .settings(

  // Project name (artifact name in Maven)
  name := "(java-cli-sbt-apache-spark)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Apache Spark Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
    "org.apache.xbean" % "xbean-asm6-shaded" % "4.10",
    "org.apache.spark" % "spark-core_2.12" % "2.4.7"
   ),

  mainClass := Some("example.Main")
)
