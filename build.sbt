ThisBuild / scalaVersion := "2.13.13"
ThisBuild / version := "1.0-SNAPSHOT"
name := "Sub-Projects-Play3.0"


lazy val main = (project in file("."))
  .enablePlugins(PlayScala)
  .dependsOn(admin, common, website)
  .aggregate(admin, common, website)

lazy val admin = (project in file("modules/admin"))
  .enablePlugins(PlayScala)

lazy val common = (project in file("modules/common"))
  .enablePlugins(PlayScala)

lazy val website = (project in file("modules/website"))
  .enablePlugins(PlayScala)





libraryDependencies ++= Seq(
  guice
)