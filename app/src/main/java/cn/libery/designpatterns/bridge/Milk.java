package cn.libery.designpatterns.bridge;

/**
 * Created by ibery on 2017/3/14.
 */

public class Milk implements CoffeeAdditives {
    @Override
    public String  addSomething() {
        return "加奶";
    }
}
