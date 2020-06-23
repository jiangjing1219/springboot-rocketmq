package com.bjpowernode.rocketmq.springbootrocketmq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.Null;

@SpringBootTest
@Slf4j
class SpringbootRocketmqApplicationTests {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    @Test
    void contextLoads() {

        rocketMQTemplate.convertAndSend("springboot_rocketmq","spring boot rocketmq test message");
        log.info("发送成功");
    }

}
