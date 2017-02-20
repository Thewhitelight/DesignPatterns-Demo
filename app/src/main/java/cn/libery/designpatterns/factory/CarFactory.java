package cn.libery.designpatterns.factory;

/**
 * Created by ibery on 2017/2/19.
 */

public abstract class CarFactory {
    public abstract <T extends AutoCar> T CreateFactory(Class<T> clz);
}
