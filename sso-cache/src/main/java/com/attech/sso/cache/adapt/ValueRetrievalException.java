package com.attech.sso.cache.adapt;

import java.util.concurrent.Callable;

/**
 * ValueRetrievalException
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-31 20:22
 **/
public class ValueRetrievalException extends RuntimeException {

    private final Object key;

    public ValueRetrievalException(Object key, Callable<?> loader, Throwable ex) {
        super(String.format("Value for key '%s' could not be loaded using '%s'", key, loader), ex);
        this.key = key;
    }

    public Object getKey() {
        return this.key;
    }
}