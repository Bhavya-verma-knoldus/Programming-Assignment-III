name := "Programming Assignment - III"

version := "0.1"

scalaVersion := "2.12.12"

lazy val program = project.in(file("Program"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % "test"
  )

lazy val root = project.in(file(".")).aggregate(program)