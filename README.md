# OpenAPI generated server

Spring Boot Petstore sample for not so common API endpoints.

## Overview

This is an API stub to provide more uncommon but 100% standard APIs that are not found in the common Petstore API.  
It can be used to test tools if they can cope with other mediatypes than application/json and   
also stuff like special characters (german Umlaute) or correctly processes float numbers.

Contributions to more APIs that cannot be found in the common petstore samples are welcome.

### Docker build

mvn spring-boot:build-image

### Start application

mvn spring-boot:run

### Generate interfaces and models.

mvn clean generate-resources -P home  
This will not compile due to duplicate classes.   
Sources can be copied to the application to integrate new APIs.

## Docker

docker build --tag=apitroublemaker:latest .

docker run -p8080:8080 apitroublemaker:latest


