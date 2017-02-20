package cn.libery.designpatterns.abstractfactory;

/**
 * Created by ibery on 2017/2/20.
 */

public abstract class CarFactory {
    public abstract Tire createTire();

    public abstract Engine createEngine();

    public abstract Brake createBrake();
}
