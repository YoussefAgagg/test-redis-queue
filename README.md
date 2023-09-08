# test-redis-queue
Push object to Redis
```
curl --location 'http://localhost:8888/send-application' \
--header 'Content-Type: application/json' \
--data '{
    "externalAppId": "11",
    "requestSystem": "YS",
    "appId": "123"
}'
```
and it will be consumed and logged into the console
