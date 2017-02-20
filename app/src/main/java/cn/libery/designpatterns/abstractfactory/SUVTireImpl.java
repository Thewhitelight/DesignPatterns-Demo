package cn.libery.designpatterns.abstractfactory;

/**
 * Created by ibery on 2017/2/20.
 */

public class SUVTireImpl implements Tire {
    @Override
    public void tire() {
        System.out.println("SUV轮胎");
    }
}
