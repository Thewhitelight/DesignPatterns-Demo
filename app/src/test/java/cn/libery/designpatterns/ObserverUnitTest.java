package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.observer.Observer;
import cn.libery.designpatterns.observer.SubscriptionSubject;
import cn.libery.designpatterns.observer.WeChatObserver;

public class ObserverUnitTest {

    @Test
    public void observerTest() throws Exception {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        Observer observerA = new WeChatObserver("A");
        Observer observerB = new WeChatObserver("B");
        Observer observerC = new WeChatObserver("C");
        subscriptionSubject.attach(observerA);
        subscriptionSubject.attach(observerB);
        subscriptionSubject.attach(observerC);
        subscriptionSubject.notify("X的公众号更新了");
    }

}