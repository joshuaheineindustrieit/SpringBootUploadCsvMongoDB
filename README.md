# SpringBootUploadCsvMongoDB


How to run:
1) First in lifecycle you will use the command mvn clean install when building
2) Second run command docker run -p 8080:8080 docker-spring-boot.jar on one terminal
3) Then run command docker run -d -p 27017:27017 mongo:latest --name mongo-db on another terminal
4) Prepare a CSV file that will be submited into Postman with the command POST http://localhost:8080/api/upload/csv/single
5) Put the key as "csvfile" and the value must be a csv file
6) The mongodb should have a database called employees and it will be uploaded there
