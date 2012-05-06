organization := "com.blockmar.persistence"

name := "core"

version := "1.0-SNAPSHOT"

crossPaths := false

publishTo := Some("Repository at Hostingbyblockmar" at "http://hostingbyblockmar.com/maven/public/")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")