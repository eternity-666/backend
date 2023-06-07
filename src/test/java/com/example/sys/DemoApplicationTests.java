package com.example.sys;

<<<<<<< HEAD

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.example.sys.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.List;
=======
import com.example.sys.mapper.InfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
>>>>>>> 135851aaf8991d8c0e08ef8cc78fa810dfc65146

@SpringBootTest
class DemoApplicationTests {

<<<<<<< HEAD
        @Resource
        private RedisTemplate<String,Object> redisTemplate;


        @Test
 void contextLoads() {


        }
=======
    @Resource
   private InfoMapper infoMapper;
>>>>>>> 135851aaf8991d8c0e08ef8cc78fa810dfc65146



}
