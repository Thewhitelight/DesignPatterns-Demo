package cn.libery.designpatterns.observer;

/**
 * Created by ibery on 2017/2/27.
 */

public class WeChatObserver implements Observer {
    private String name;

    public WeChatObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "-" + msg);
    }
}
