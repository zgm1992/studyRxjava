package com.jarvan.study.rxjava;

import com.jarvan.study.rxjava.core.Observable;
import com.jarvan.study.rxjava.core.ObservableEmitter;
import com.jarvan.study.rxjava.core.ObservableOnSubscribe;
import com.jarvan.study.rxjava.core.Observer;
import com.jarvan.study.rxjava.disposables.Disposable;

public class Test {
    void onTest(){
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Throwable {

            }
        }).subScribe(new Observer<String>() {
            @Override
            public void onSubScribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        });

    }
}
