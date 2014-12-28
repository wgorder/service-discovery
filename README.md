# service-discovery
A Eureka server implemented using spring-cloud 

> This project is a part of a few example projects I am throwing together as I try to get my head around how the spring-cloud modules fit together

Initially this server just runs stand-alone with no peer discovery

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
