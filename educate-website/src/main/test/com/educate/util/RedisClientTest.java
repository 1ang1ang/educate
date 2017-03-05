package com.educate.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by sun on 2017/3/4.
 */
@RunWith(SpringRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // 指定我们SpringBoot工程的Application启动类~springboot 1.4及以后都是用这个
public class RedisClientTest {

    @Autowired
    private RedisSession client;

    @Test
    public void redisClientTest() throws Exception {
        client.set("xxxx", "zzz");
        System.out.println(client.get("xxxx"));

    }
}
