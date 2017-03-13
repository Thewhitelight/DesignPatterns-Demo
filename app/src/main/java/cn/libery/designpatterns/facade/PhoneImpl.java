package cn.libery.designpatterns.facade;

/**
 * Created by ibery on 2017/3/13.
 */

public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
