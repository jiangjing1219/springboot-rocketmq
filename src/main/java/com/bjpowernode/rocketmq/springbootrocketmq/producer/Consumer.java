package com.bjpowernode.rocketmq.springbootrocketmq.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * ClassName:Producer
 * Package:com.bjpowernode.rocketmq.springbootrocketmq.producer
 * Description:
 *
 * @date:2020/6/20 16:26
 * @author:jiangjing
 *
 *
 * consumerGroup 可以直接写死，但是也可以 写在配置文件中，直接从配置文件读取
 *
 *
 */
@Slf4j
@Component
//@RocketMQMessageListener(topic = "springboot_rocketmq",consumerGroup = "springboot-mq-consumer")
@RocketMQMessageListener(topic = "springboot_rocketmq",consumerGroup = "${spring-boot-consumer-group}")
public class Consumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        log.info("接收到的消息是："+s);
    }




}
