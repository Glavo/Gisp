lazy val root = (project in file("."))
  .settings(
    autoScalaLibrary := false
  ).aggregate(compiler, runtime)

lazy val compiler = (project in file("compiler"))
  .settings(
    name := "Gisp-compiler",
    version := "0.1",
    scalaVersion := "2.12.4",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "fastparse" % "1.0.0",
      "org.scala-lang.modules" % "scala-asm" % "6.0.0-scala-1"
    )
  ).dependsOn(runtime)

lazy val runtime = (project in file("runtime"))
  .settings(
    name := "Gisp-runtime",
    autoScalaLibrary := false
  )