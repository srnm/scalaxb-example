import ScalaxbKeys._

organization := "srnm.github.com"

name := "scalaxb-example"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.2" % "test"

scalaxbSettings

packageName in scalaxb in Compile := "ipo"

sourceGenerators in Compile <+= scalaxb in Compile

