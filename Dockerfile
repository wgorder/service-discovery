FROM wgorder/java8-jce
MAINTAINER Bill Gorder <william.gorder>

# Add the application to the container
ADD build/libs/service-discovery.jar /data/service-discovery.jar

# Expose
EXPOSE  8761

# Run
CMD ["java", "-jar", "service-discovery.jar"]
