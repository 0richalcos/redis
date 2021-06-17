package com.orichalcos.cache;

import com.orichalcos.utils.ApplicationContextUtils;
import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * @author Orichalcos
 * 自定义Redis缓存实现
 */
public class RedisCache implements Cache {

    private final String id;

    public RedisCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void putObject(Object key, Object value) {
        getRedisTemplate().opsForHash().put(id, key.toString(), value);
    }

    @Override
    public Object getObject(Object key) {
        return getRedisTemplate().opsForHash().get(id, key.toString());
    }

    @Override
    public Object removeObject(Object key) {
        return getRedisTemplate().opsForHash().delete(id, key.toString());
    }

    @Override
    public void clear() {
        getRedisTemplate().delete(id);
    }

    @Override
    public int getSize() {
        return getRedisTemplate().opsForHash().size(id).intValue();
    }

    private RedisTemplate getRedisTemplate() {
        RedisTemplate redisTemplate = (RedisTemplate) ApplicationContextUtils.getBean("redisTemplate");
        redisTemplate.setKeySerializer(RedisSerializer.string());
        redisTemplate.setHashKeySerializer(RedisSerializer.string());
        return redisTemplate;
    }
}
