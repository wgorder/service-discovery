service-discovery
===========
A Eureka server implemented using spring-cloud 

Initially this server just runs stand-alone with no peer discovery

### Build
```
./gradlew build
```

### Run only network-discovery
~~./gradlew :bootRun~~
wont work due to this bug -- https://github.com/spring-cloud/spring-cloud-netflix/issues/60

Instead do it the old fashion way...

```
java -jar service-discovery.jar
```

### Run All the applications
See [spring-cloud-examples](https://github.com/wgorder/spring-cloud-examples)

