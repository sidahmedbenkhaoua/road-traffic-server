name := "RTS"

version := "1.0"

scalaVersion := "2.11.6"

pomExtra :=
  <scm>
    <url>git@github.com:scommon/sbt-plugin-simple.git</url>
    <connection>scm:git:git@github.com:scommon/sbt-plugin-simple.git</connection>
  </scm>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <developers>
      <developer>
        <id>sbenkhaoua</id>
        <name>sidahmed  benkhaoua</name>
        <email>sidahmed.benkhaoua@gmail.com</email>
        <url>http://benkhaouas.blogspot.com//</url>
        <organization>iconsoftware</organization>
        <organizationUrl>http://www.iconsoftware.dz/</organizationUrl>
        <roles>
          <role>Architect</role>
          <role>devlopper</role>
        </roles>
      </developer>
    </developers>

resolvers += "Job Server Bintray" at "https://dl.bintray.com/spark-jobserver/maven"

libraryDependencies += "spark.jobserver" % "job-server-api" % "0.5.0" % "provided"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.2.0"

libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "2.1.5"

libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-mapping" % "2.1.5"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "1.2.0-rc3"


