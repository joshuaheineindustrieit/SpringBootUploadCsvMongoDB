# SpringBootUploadCsvMongoDB


How to run:
1) First run command docker run -p 8080:8080 docker-spring-boot.jar on one terminal
2) Then run command docker run -d -p 27017:27017 mongo:latest --name mongo-db on another terminal
3) Prepare a CSV file that will be submited into Postman with the command POST http://localhost:8080/api/upload/csv/single
4) Put the key as "csvfile" and the value must be a csv file
5) The mongodb should have a database called employees and it will be uploaded there
