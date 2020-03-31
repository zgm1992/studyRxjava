package com.jarvan.study.rxjava.core;

import androidx.annotation.Nullable;

public interface ObserableSource<T>  {

    void subScribe(Observer<T> observer);

}
