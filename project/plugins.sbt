logLevel := util.Level.Debug

addSbtPlugin("org.scalameta"     % "sbt-scalafmt"       % "2.4.6")
addSbtPlugin("com.typesafe.play" % "sbt-plugin"         % "2.8.17")
addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter" % "0.7.0")
addSbtPlugin("io.gatling"        % "gatling-sbt"        % "4.2.4")
addSbtPlugin("com.typesafe.sbt"  % "sbt-twirl"          % "1.5.1")
addSbtPlugin("ch.epfl.scala"     % "sbt-bloop"          % "1032048a")

addSbtPlugin("com.dwijnand"            % "sbt-dynver"          % "4.1.1")
addSbtPlugin("com.eed3si9n"            % "sbt-buildinfo"       % "0.11.0")
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc"       % "2.2.0")
addSbtPlugin("com.typesafe.sbt"        % "sbt-native-packager" % "1.8.1")
addSbtPlugin("de.heikoseeberger"       % "sbt-header"          % "5.7.0")
