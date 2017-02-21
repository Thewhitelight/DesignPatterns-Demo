package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.factory.AutoCar;
import cn.libery.designpatterns.factory.AutoCar1;
import cn.libery.designpatterns.factory.AutoCar2;
import cn.libery.designpatterns.factory.AutoCarFactory;
import cn.libery.designpatterns.factory.CarFactory;

public class FactoryUnitTest {

    @Test
    public void factoryTest() throws Exception {
        CarFactory factory = new AutoCarFactory();
        AutoCar car1 = factory.CreateFactory(AutoCar1.class);
        car1.drive();
        car1.voice();

        System.out.println("- - - - - - - - - - - - - - - - - - - -");

        AutoCar car2 = factory.CreateFactory(AutoCar2.class);
        car2.drive();
        car2.voice();
    }

}