# Spring Cloud Gateway

This is a very basic example of Gateway Service using Netflix Zuul from Spring Cloud.
It has four modules:

* [Gateway-service module](https://github.com/geraldoms/spring-cloud-gateway/tree/master/gateway-service): 
 This module contains a simple gateway service using the Netflix Zuul.
 
* [Discovery-server module](https://github.com/geraldoms/spring-cloud-gateway/tree/master/discovery-server):
This module contains the service discovery using the Netflix Eureka to keep the info to access the services.

* [Weather-service module](https://github.com/geraldoms/spring-cloud-gateway/tree/master/weather-service): 
This module contains the weather service which returns a random weather info.

* [Time-service module](https://github.com/geraldoms/spring-cloud-gateway/tree/master/time-service): 
This module contains the weather service which returns the current date and time.

To run this example you need to execute Discovery-server first. The order of the remaining services are not really important. 
A basic flow of the application is shown in the figure below.

<p align="center">
  <img width="460" height="500" src="https://user-images.githubusercontent.com/13106549/43080628-1970cb38-8e5e-11e8-9884-d88328077a94.png">
</p>

## Requirements
* JDK 8 or later
* Maven 3.2+

## Installation 
`$ mvn package`

## Usage 

After running the command above (in the installation section), you can start the application by running the the following commands:   
 
 1. `java -jar discovery-server/target/discovery-server-0.0.1-SNAPSHOT.jar`;
 2. `java -jar gateway-service/target/gateway-service-0.0.1-SNAPSHOT.jar`
 3. `java -jar weather-service/target/weather-service-0.0.1-SNAPSHOT.jar`;
 4. `java -jar time-service/target/time-service-0.0.1-SNAPSHOT.jar`;

The weather-service and time-service will start using the ports 8282 and 8281, respectively. 
However, they can be accessed thorough the Gateway service at `http://localhost:8080/`.

## Request samples 

Request:
```bash
curl http://localhost:8080/weather
```
Response:
```json
Cloudy
```

Request:
```bash
http://localhost:8080/time
```
Response:
```json
Hello, today is Monday, the date is 7-23-2018 and the time right now is 10:01:38.
```
