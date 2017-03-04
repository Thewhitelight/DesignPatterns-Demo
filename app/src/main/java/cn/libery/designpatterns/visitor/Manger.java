package cn.libery.designpatterns.visitor;

import java.util.Random;

/**
 * Created by ibery on 2017/3/4.
 */

public class Manger extends Staff {
    private int products;

    public Manger(String name) {
        super(name);
        products = new Random().nextInt(5);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    public int getProducts() {
        return products;
    }
}
