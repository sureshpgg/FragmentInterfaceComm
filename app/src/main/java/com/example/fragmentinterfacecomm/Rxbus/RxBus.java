package com.example.fragmentinterfacecomm.Rxbus;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public class RxBus {

    private static RxBus mInstance;

    public static RxBus getInstance() {
        if (mInstance == null) {
            mInstance = new RxBus();
        }
        return mInstance;
    }

    private RxBus() {
    }

    private PublishSubject<String> publisher = PublishSubject.create();

    public void publish(String event) {
        publisher.onNext(event);
    }

    // Listen should return an Observable
    public Observable<String> listen() {
        return publisher;
    }

}
