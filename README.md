service-discovery
===========
A Eureka server implemented using spring-cloud 

> This project is a part of a few example projects I am throwing together as I try to get my head around how the spring-cloud modules fit together

Initially this server just runs stand-alone with no peer discovery

### Purpose
The application will be a simple shopping cart application with the following goals

* Demonstrate spring-cloud netflix with Eureka for service discoverablility
* Demonstrate spring-cloud Zuul proxy for creating an api-gateway layer to backend services
* Use spring-cloud SSO support for authentication
* Implement a user registration flow
* Allow signon from social sites facebook, google etc
* Demonstrate spring-cloud hystrix for implementing the circut breaker pattern
* Demonstate spring-session with a redis backend store for session/cart information
* Demonstrate Spring data rest/HATEOAS with a mongo backend to store and serve customer and order information
* An angular UI service that can traverse HATEOAS links
* Run locally or deploy to AWS or CF

### Build
```
./gradlew build
```

### Run only network-discovery
~~./gradlew :bootRun~~
wont work due to this bug -- https://github.com/spring-cloud/spring-cloud-netflix/issues/60

```
java -jar service-discovery.jar
```

### Run All the applications
* Install docker, boot2docker and fig
* Start boot2Docker
```
boot2docker start
```
* start the applications
```
fig up
```
Note when using fig you must use the ip from boot2docker
```
boot2docker ip
```
If you would like to be able to use localhost you must use the workaround found here:
https://github.com/boot2docker/boot2docker/blob/master/doc/WORKAROUNDS.md


### Related repositories
[api-gateway](https://github.com/wgorder/api-gateway)
