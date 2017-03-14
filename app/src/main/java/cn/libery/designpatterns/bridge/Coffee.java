package cn.libery.designpatterns.bridge;

/**
 * Created by ibery on 2017/3/14.
 */

public abstract class Coffee {

    protected CoffeeAdditives coffeeAdditives;

    public Coffee(CoffeeAdditives coffeeAdditives) {
        this.coffeeAdditives = coffeeAdditives;
    }
    public abstract void makeCoffee();
}
