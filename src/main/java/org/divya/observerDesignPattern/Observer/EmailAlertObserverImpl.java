package org.divya.observerDesignPattern.Observer;

import org.divya.observerDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String email;
    StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(email, "product is in stock hurry!");
    }

    private void sendMail(String email, String s) {
        System.out.println("mail sent to " + email);
    }
}
