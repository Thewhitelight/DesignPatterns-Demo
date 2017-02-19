package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.factory.AutoCar;
import cn.libery.designpatterns.factory.AutoCar1;
import cn.libery.designpatterns.factory.AutoCar2;
import cn.libery.designpatterns.factory.AutoCarFactory;
import cn.libery.designpatterns.factory.AutoFactory;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FactoryUnitTest {

    @Test
    public void factoryTest() throws Exception {
        AutoFactory factory = new AutoCarFactory();
        AutoCar car1 = factory.CreateFactory(AutoCar1.class);
        AutoCar car2 = factory.CreateFactory(AutoCar2.class);
        AutoCar car=new AutoCar() {
            @Override
            public void drive() {

            }

            @Override
            public void voice() {

            }
        };
        car1.drive();
        car1.voice();
        car2.drive();
        car2.voice();
    }

}