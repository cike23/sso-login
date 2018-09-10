package com.attech.sso.cache;

import java.util.TimerTask;

import com.attech.sso.cache.strategy.CacheStrategy;

/**
 * CacheEvictTask
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-31 20:07
 **/
public class CacheEvictTask extends TimerTask {

    private final CacheStrategy cacheStrategy; //缓存策略

    private final Object key; //要清除的键

    public CacheEvictTask(CacheStrategy cacheStrategy, Object key) {
        this.cacheStrategy = cacheStrategy;
        this.key = key;
    }

    @Override
    public void run() {
        cacheStrategy.evict(key);
    }

}