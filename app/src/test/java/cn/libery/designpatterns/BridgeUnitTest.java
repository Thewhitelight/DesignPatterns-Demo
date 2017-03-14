package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.bridge.LargeCoffee;
import cn.libery.designpatterns.bridge.Milk;
import cn.libery.designpatterns.bridge.SmallCoffee;
import cn.libery.designpatterns.bridge.Sugar;

public class BridgeUnitTest {

    @Test
    public void bridgeTest() throws Exception {
        Sugar sugar=new Sugar();
        LargeCoffee largeSugarCoffee=new LargeCoffee(sugar);
        largeSugarCoffee.makeCoffee();
        SmallCoffee smallSugarCoffee=new SmallCoffee(sugar);
        smallSugarCoffee.makeCoffee();
        System.out.println("----------------------");
        Milk milk=new Milk();
        LargeCoffee largeMilkCoffee=new LargeCoffee(milk);
        largeMilkCoffee.makeCoffee();
        SmallCoffee smallMilkCoffee=new SmallCoffee(milk);
        smallMilkCoffee.makeCoffee();
    }

}