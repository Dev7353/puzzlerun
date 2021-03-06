name          := "htwg-scala-puzzlerun"
organization  := "de.htwg.se"
version       := "0.0.1"
scalaVersion  := "2.11.8"
scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

resolvers += Resolver.jcenterRepo
libraryDependencies += "org.scala-lang" % "scala-swing" % "2.11+"
libraryDependencies += "net.liftweb" %% "lift-json" % "2.6+"
libraryDependencies += "net.codingwell" %% "scala-guice" % "4.1.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.0"
libraryDependencies ++= {
  val scalaTestV       = "3.0.0-M15"
  val scalaMockV       = "3.2.2"
  Seq(
    "org.scalatest" %% "scalatest"                   % scalaTestV       % "test",
    "org.scalamock" %% "scalamock-scalatest-support" % scalaMockV       % "test"
  )
}
