import ScalaxbKeys._

name := "sbt-scalaxb-hotelbeds-sample"

seq(scalaxbSettings: _*)

packageName in scalaxb in Compile := "hotelbeds"

sourceGenerators in Compile <+= scalaxb in Compile

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-http" % "0.8.5"
)
