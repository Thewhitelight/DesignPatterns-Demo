package cn.libery.designpatterns.factory;

/**
 * Created by ibery on 2017/2/19.
 */

public class AutoCar2 extends AutoCar {
    @Override
    public void drive() {
        System.out.println("AutoCar2 drive");
    }

    @Override
    public void voice() {
        System.out.println("AutoCar2 voice");
    }
}
