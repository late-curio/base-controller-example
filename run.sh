#agent="/opt/newrelic/newrelic.jar"
agent="/Users/tcrone/lib/nrjars/newrelic-agent-7.5.0-SNAPSHOT.jar"
config="/opt/newrelic/newrelic.yml"
env="staging"
jar="build/libs/basecontrollerexample-0.0.1-SNAPSHOT.jar"
./gradlew build
java  -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Dnewrelic.config.file=$config -Dnewrelic.environment=$env -javaagent:$agent -jar $jar
