package cn.libery.designpatterns.visitor;

import java.util.Random;

/**
 * Created by ibery on 2017/3/4.
 */

public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
