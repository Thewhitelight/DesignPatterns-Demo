package cn.libery.designpatterns.observer;

/**
 * Created by ibery on 2017/2/27.
 */

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String msg);
}
