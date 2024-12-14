package org.divya.observerDesignPattern.Observer;

import org.divya.observerDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(userName, "product is in stock hurry!");
    }

    private void sendMail(String email, String s) {
        System.out.println("mail sent to " + email);
    }
}
