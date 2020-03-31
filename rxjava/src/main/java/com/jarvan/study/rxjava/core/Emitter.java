package com.jarvan.study.rxjava.core;

public interface Emitter<T> {
    void onNext(T t);

    void onError(Throwable throwable);

    void onComplete();
}
