package cn.libery.designpatterns.abstractfactory;

/**
 * Created by ibery on 2017/2/20.
 */

public class NormalTireImpl implements Tire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
