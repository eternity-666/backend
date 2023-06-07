package com.example.sys;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;


@SpringBootTest
class DemoApplicationTests {


        @Resource
        private RedisTemplate<String,Object> redisTemplate;


        @Test
 void contextLoads() {


        }






}
