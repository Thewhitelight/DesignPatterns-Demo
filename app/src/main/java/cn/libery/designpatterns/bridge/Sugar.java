package cn.libery.designpatterns.bridge;

/**
 * Created by ibery on 2017/3/14.
 */

public class Sugar implements CoffeeAdditives {
    @Override
    public String  addSomething() {
        return "加糖";
    }
}
