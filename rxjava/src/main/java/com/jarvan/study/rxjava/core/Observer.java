package com.jarvan.study.rxjava.core;

import com.jarvan.study.rxjava.disposables.Disposable;

public interface Observer<T> {
    void onSubScribe(Disposable d);

    void onNext(T t);

    void onError(Throwable throwable);

    void onComplete();
}
