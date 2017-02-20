package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.abstractfactory.AutoFactory1;
import cn.libery.designpatterns.abstractfactory.AutoFactory2;
import cn.libery.designpatterns.abstractfactory.CarFactory;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AbstractFactoryUnitTest {

    @Test
    public void factoryTest() throws Exception {
        CarFactory carFactory1 = new AutoFactory1();
        carFactory1.createEngine().engine();
        carFactory1.createBrake().brake();
        carFactory1.createTire().tire();

        System.out.println("- - - - - - - - - - - - - - - - - - - -");

        CarFactory carFactory2 = new AutoFactory2();
        carFactory2.createEngine().engine();
        carFactory2.createBrake().brake();
        carFactory2.createTire().tire();
    }

}