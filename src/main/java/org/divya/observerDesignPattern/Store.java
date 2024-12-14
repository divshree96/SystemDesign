package org.divya.observerDesignPattern;

import org.divya.observerDesignPattern.Observable.IphoneObservable;
import org.divya.observerDesignPattern.Observable.StockObservable;
import org.divya.observerDesignPattern.Observer.EmailAlertObserverImpl;
import org.divya.observerDesignPattern.Observer.MobileAlertObserverImpl;
import org.divya.observerDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver ob1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneObservable);
        NotificationAlertObserver ob2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneObservable);
        NotificationAlertObserver ob3 = new MobileAlertObserverImpl("xyz_username", iphoneObservable);

        iphoneObservable.add(ob1);
        iphoneObservable.add(ob2);
        iphoneObservable.add(ob3);

        iphoneObservable.setStockCount(10);
    }
}
