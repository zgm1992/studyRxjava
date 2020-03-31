package com.jarvan.study.rxjava.core;

import com.jarvan.study.rxjava.plugin.RxJavaPlugins;

import java.util.Objects;

public class Observable<T> implements ObserableSource<T> {

    @Override
    public void subScribe(Observer<T> observer) {

    }


    public static <T>Observable<T> create(ObservableOnSubscribe<T> source){
//        Objects.isNull(source);

        return RxJavaPlugins.onAssembly(new ObservableCreate<>(source));
    }

}
