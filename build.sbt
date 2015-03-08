lazy val commonSettings = Seq(
  organization := "com.example",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.11.6"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "gradle-sbt-scala",

    fork in run := true,
  
    libraryDependencies ++= Seq(
      "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
      "org.slf4j" % "slf4j-api" % "1.7.5",
      "ch.qos.logback" % "logback-classic" % "1.1.2"
    )


  )
