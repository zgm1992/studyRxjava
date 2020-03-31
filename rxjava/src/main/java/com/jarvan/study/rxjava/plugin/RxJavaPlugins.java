package com.jarvan.study.rxjava.plugin;

import com.jarvan.study.rxjava.core.Observable;
import com.jarvan.study.rxjava.functions.Function;

import pallel.ParallelFlowable;

public final class RxJavaPlugins {

    static volatile Function<? super ParallelFlowable,? extends ParallelFlowable> onParallelAssembly;

//    static <T,R> R apply(Function<T,R> f,T t){
//        try{
//            return f.apply(t);
//        } catch (Throwable ex){
////           ex.printStackTrace(); //todo 这里有一个helper 的，不知道是不是onError 的一个入口
////            throw ex;
//        }
//        return null;
//    }

    static <T, R> R apply( Function<T, R> f, T t) {
        try {
            return f.apply(t);
        } catch (Throwable ex) {
//            throw ExceptionHelper.wrapOrThrow(ex);
            return null;
        }
    }


    public static <T>Observable<T> onAssembly(Observable<T> source){
        Function<? super ParallelFlowable,? extends ParallelFlowable> f = onParallelAssembly;
        if (f!=null){
            return apply(f,source);
        }
        return source;
    }
}
