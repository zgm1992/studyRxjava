package com.jarvan.study.rxjava.core;

import com.jarvan.study.rxjava.disposables.Disposable;

public interface ObservableEmitter<T> extends Emitter<T> {

    void serDisposable(Disposable disposable);



}
