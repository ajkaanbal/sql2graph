val scalaTest = "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test";

lazy val root1 = (project in file(".")).
  dependsOn(ProjectRef(uri("https://github.com/debugger87/scala-sql-parser.git"), "scala-sql-parser")).
  settings(
    name := "sql2graph",
    version := "1.0",
    libraryDependencies += scalaTest
  )
