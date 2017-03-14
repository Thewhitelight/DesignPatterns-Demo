package cn.libery.designpatterns.bridge;

/**
 * Created by ibery on 2017/3/14.
 */

public class SmallCoffee extends Coffee {

    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的"+coffeeAdditives.addSomething()+"咖啡");
    }
}
