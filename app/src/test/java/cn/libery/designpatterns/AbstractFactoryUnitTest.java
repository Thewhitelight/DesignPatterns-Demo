package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.abstractfactory.AutoFactory1;
import cn.libery.designpatterns.abstractfactory.AutoFactory2;
import cn.libery.designpatterns.abstractfactory.CarFactory;

public class AbstractFactoryUnitTest {

    @Test
    public void abstractFactoryTest() throws Exception {
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