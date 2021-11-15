# SpringBootUploadCsvMongoDB
 • The user needs to have Postman in order to submit files to the mongoDB.
 • You can submit a single file with the POST command: http://localhost:8080/api/upload/csv/single 
 • Then add go to key and add csvfile and value with the CSV file.

 • You must create a database for employees at the port 27017. 
 • With the way the docker file is composed it will be able to connect 8080 to 27017.
