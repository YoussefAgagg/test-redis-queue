FROM eclipse-temurin:17-alpine as builder
WORKDIR extracted
ADD ./build/libs/test-redis-queue-0.0.1-SNAPSHOT.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM eclipse-temurin:17-alpine
WORKDIR application
COPY --from=builder extracted/dependencies/ ./
COPY --from=builder extracted/spring-boot-loader/ ./
COPY --from=builder extracted/snapshot-dependencies/ ./
COPY --from=builder extracted/application/ ./

EXPOSE 8888

ENTRYPOINT ["java","--enable-preview","-Dspring.profiles.active=docker", "org.springframework.boot.loader.JarLauncher"]