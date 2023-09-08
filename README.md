# test-redis-queue

## How To Setup

To clone and run this application, you'll need [Git](https://git-scm.com),
, [Java 17](https://www.oracle.com/technetwork/java/javase/downloads/jdk17-downloads-5066655.html), [docker](https://docs.docker.com/desktop/).

_Clone this repository_


Run the below commands

```bash 
./gradlew build 
 ```
```bash
docker compose build 
```

```bash
docker compose up 
```

Push object to Redis queue
```
curl --location 'http://localhost:8888/send-application' \
--header 'Content-Type: application/json' \
--data '{
    "externalAppId": "11",
    "companyName": "test",
    "companyOwner": "jo"
}'
```
and it will be consumed and logged into the console
