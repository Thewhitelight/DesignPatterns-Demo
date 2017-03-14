package cn.libery.designpatterns.bridge;

/**
 * Created by ibery on 2017/3/14.
 */

public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的"+coffeeAdditives.addSomething()+"咖啡");
    }
}
