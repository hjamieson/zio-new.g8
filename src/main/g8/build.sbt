import Dependencies._

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "$organization$"

lazy val root = (project in file("."))
  .settings(
    name := "alpha",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      zio
    )
  )
