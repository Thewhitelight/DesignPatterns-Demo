package cn.libery.designpatterns.factory;

/**
 * Created by ibery on 2017/2/19.
 */

public class AutoCarFactory extends CarFactory {

    @Override
    public <T extends AutoCar> T CreateFactory(Class<T> clz) {
        AutoCar car=null;
        try {
            car= (AutoCar) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
