package com.hwua.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisService{
    @Autowired
    private StringRedisTemplate redisTemplate;
    /**
     * 获取key对应的值
     * @param key
     * @return
     * @throws Exception
     */
    public String getkey(String key) throws Exception{
        return redisTemplate.opsForValue().get(key);
    }

    public void setValue(String key,String value) throws Exception{
        redisTemplate.opsForValue().set(key,value);
    }
}
