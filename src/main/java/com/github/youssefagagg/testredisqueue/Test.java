package com.github.youssefagagg.testredisqueue;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Test {

    private final RedisTemplate<String, ApplicationRequest> redisTemplate;

    @PostMapping("/send-application")
    public void sendApplication(@RequestBody ApplicationRequest application) {
        System.out.println(("send application to queue: {}" + application));
//        redisTemplate.convertAndSend("application-queue", application);
   //     redisTemplate.opsForList().leftPush("application-queue",application);
        redisTemplate.boundListOps("application-queue").leftPush(application);
    }
}