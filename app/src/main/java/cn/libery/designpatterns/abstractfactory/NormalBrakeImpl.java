package cn.libery.designpatterns.abstractfactory;

/**
 * Created by ibery on 2017/2/20.
 */

public class NormalBrakeImpl implements Brake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
