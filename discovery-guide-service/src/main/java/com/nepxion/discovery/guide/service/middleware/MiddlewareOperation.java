package com.nepxion.discovery.guide.service.middleware;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MiddlewareOperation {
    @Autowired
    private MyBatisOperation myBatisOperation;

    @Autowired
    private RedisOperation redisOperation;

    @Autowired
    private MongoDBOperation mongoDBOperation;

    @Autowired
    private RabbitMQOperation rabbitMQOperation;

    @Autowired
    private ActiveMQOperation activeMQOperation;

    @Autowired
    private RocketMQOperation rocketMQOperation;

    public void operate() {
        myBatisOperation.operate();
        redisOperation.operate();
        mongoDBOperation.operate();
        rabbitMQOperation.operate();
        activeMQOperation.operate();
        rocketMQOperation.operate();
    }
}