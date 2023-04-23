ThisBuild / scalaVersion     := "2.13.10"
ThisBuild / version          := "0.1.0"

val chiselVersion = "3.6.0"
val chiseltestVersion = "0.6.0"

lazy val root = (project in file("."))
  .settings(
    name := "chisel-project",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % chiselVersion,
      "edu.berkeley.cs" %% "chiseltest" % chiseltestVersion
    ),
    scalacOptions ++= Seq(
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
      "-P:chiselplugin:genBundleElements",
    ),
    addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % chiselVersion cross CrossVersion.full),
  )

