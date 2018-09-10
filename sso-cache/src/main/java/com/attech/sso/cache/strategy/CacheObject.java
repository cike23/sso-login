package com.attech.sso.cache.strategy;

/**
 * CacheObject
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-31 20:09
 **/
public class CacheObject {

    private Object key;
    private Object value;
    public Object getKey() {
        return key;
    }
    public void setKey(Object key) {
        this.key = key;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}