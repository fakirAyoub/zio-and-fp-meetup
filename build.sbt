ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(name := "zio-and-fp", idePackagePrefix := Some("dev.fakir.ziofp"))

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.2.2"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.2.2"
libraryDependencies += "dev.zio" %% "zio" % "1.0.14"
libraryDependencies += "dev.zio" %% "zio-prelude" % "1.0.0-RC14"
