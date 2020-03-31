package com.jarvan.study.rxjava.core;

public interface ObservableOnSubscribe<T> {

    void subscribe(ObservableEmitter<T> emitter) throws Throwable;

}
