package com.github.youssefagagg.testredisqueue;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

@Configuration
@EnableRedisRepositories
public class RedisConfig {

//    @Value("${spring.redis.host}")
//    private String redisHost;
//
//    @Value("${spring.redis.port}")
//    private Integer redisPort;

//    @Bean
//    public RedisConnection redisConnection() {
//        return new RedisConnection(redisHost, redisPort, "");
//    }

//    @Bean
//    public RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
//                                                   MessageListenerAdapter listenerAdapter) {
//
//        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//        container.addMessageListener(listenerAdapter, new PatternTopic("application-queue"));
//
//        return container;
//    }


//    @Bean
//    public MessageListenerAdapter listenerAdapter(ApplicationReceiver receiver) {
//        var messageListenerAdapter = new MessageListenerAdapter(receiver, "receiveApplication");
//        messageListenerAdapter.setSerializer(new Jackson2JsonRedisSerializer<>(ApplicationRequest.class));
//        return messageListenerAdapter;
//    }

//    @Bean
//    public RedisTemplate<String, ApplicationRequest> redisTemplate() {
//        RedisTemplate<String, ApplicationRequest> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(getConnectionFactory());
//        redisTemplate.setDefaultSerializer(new Jackson2JsonRedisSerializer<>(ApplicationRequest.class));
//
//        return redisTemplate;
//    }
//    @Bean
//    MessagePublisher redisPublisher() {
//        return new RedisMessagePublisher(redisTemplate(), topic());
//    }
//@Bean
//JedisConnectionFactory jedisConnectionFactory() {
//    JedisConnectionFactory jedisConFactory
//            = new JedisConnectionFactory();
//    return jedisConFactory;
//}
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//
//        return redisTemplate;
//    }


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

//    @Bean
//    @Primary
//    public RedisProperties redisProperties() {
//        return new RedisProperties();
//    }
}
