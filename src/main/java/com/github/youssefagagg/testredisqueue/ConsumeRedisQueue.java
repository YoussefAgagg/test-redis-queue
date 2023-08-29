package com.github.youssefagagg.testredisqueue;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ConsumeRedisQueue {
    private final RedisTemplate<String, ApplicationRequest> redisTemplate;

    @Async
    @Scheduled(fixedRate = 1000)
    public void processDelayedAutomationRules() {
        log.info(Thread.currentThread().getName() + ":");
        log.info("application recived :{}", redisTemplate.boundListOps("application-queue").rightPop());

    }
}
