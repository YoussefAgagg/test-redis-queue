package com.github.youssefagagg.testredisqueue;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

@Configuration
@EnableRedisRepositories
public class RedisConfig {



    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {

        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
    }

    @Bean
    public RedisTemplate<String, ApplicationRequest> redisTemplate() {
        final RedisTemplate<String, ApplicationRequest> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory());

        template.setDefaultSerializer(new Jackson2JsonRedisSerializer<>(ApplicationRequest.class));
        template.setEnableTransactionSupport(true);
        return template;
    }

}
