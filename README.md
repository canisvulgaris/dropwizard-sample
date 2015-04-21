#build package
mvn clean package

#run application
java -jar target/my-app-1.0-SNAPSHOT.jar server app.yml 