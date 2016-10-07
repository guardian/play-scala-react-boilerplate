name := "play-scala-react-boilerplate"

version := "1.0"

def env(key: String): Option[String] = Option(System.getenv(key))

lazy val root = (project in file(".")).enablePlugins(PlayScala)
    .settings(
      play.sbt.PlayImport.PlayKeys.playDefaultPort := 9000
    )

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  ws
)