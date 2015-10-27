val scalaTest = "org.scalatest" % "scalatest_2.10" % "2.2.4" % "test";

lazy val root1 = (project in file(".")).
  dependsOn(ProjectRef(uri("https://github.com/debugger87/scala-sql-parser.git"), "scala-sql-parser")).
  settings(
    name := "sql2graph",
    version := "1.0",
    scalaVersion := "2.10.4",
    libraryDependencies += scalaTest
  )
