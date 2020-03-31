package com.jarvan.study.rxjava.functions;

public interface Function<T,R> {
    R apply(T t) throws Throwable;
}
