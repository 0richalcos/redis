package com.orichalcos.cache;

import org.apache.ibatis.cache.Cache;

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
    }

    @Override
    public Object getObject(Object key) {
        System.out.println("key====" + key.toString());
        return null;
    }

    @Override
    public Object removeObject(Object key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }
}
