package cn.libery.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ibery on 2017/2/27.
 */

public class SubscriptionSubject implements Subject {

    private List<Observer> observers = new ArrayList<>(3);

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }
}
