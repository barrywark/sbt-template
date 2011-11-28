import AssemblyKeys._

name := "sbt-template"

organization := "com.physionconsulting"

version := 1.0

scalaVersion := 2.9.1

seq(assemblySettings: _*)

jarName in assembly := "sbt-template.jar"


/*
libraryDependencies += groupID % artifactID % revision
// use groupID %% artifactID % revision for artifacts that depend on scala version (e.g. specs)

libraryDependencies ++= Seq(
	groupID % artifactID % revision,
	groupID % otherID % otherRevision
)
*/