# SpringBootUploadCsvMongoDB
## Overview

[TOC]

## Getting started

### Prerequisites

- openjdk = 15


### Playground

To test your upload your csvfiles, open postman and use the post command http://localhost:8080/api/upload/csv/single 


## Project Structure

- `/com.example.springboot.uploadcsv.mongodb`
  - `/controller` - commands for uploading, downloading and accessing employee information
  - `/document` - setter and getter methods of employees
  - `/errorhandler` - error handling
  - `/message` - message handling
  - `/repository` - employee repository 
  - `/services` - csv file services
 - `/util` - start up

## Deployment

When posting the csv file you must set the 'key' as csvfile and the value as the csv file.

The fields that are accepted are:

\- `name`

 \- `department`

 \- `/job_position`

 \- `start_date`

 \- `end_date`

### Docker

How to run it

download MongoDb

sudo docker pull mongo:4.0.4

Build the image

docker build -t docker-spring-boot.jar .

Run the container(s)

$ docker run -p 8080:8080 docker-spring-boot.jar

$ docker run -d -p 27017:27017 mongo:latest --name mongo-db


Access Mongo

In terminal:
mongo

use employees

db.employees.find().pretty()


## License

UNLICENSED
