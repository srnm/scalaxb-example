import ScalaxbKeys._

organization := "srnm.github.com"

name := "scalaxb-example"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"

scalaxbSettings

packageName in scalaxb in Compile := "ipo"

sourceGenerators in Compile <+= scalaxb in Compile

