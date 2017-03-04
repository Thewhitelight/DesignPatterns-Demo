package cn.libery.designpatterns.visitor;

import java.util.Random;

/**
 * Created by ibery on 2017/3/4.
 */

public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    public int getCodeLines() {
        return new Random().nextInt(500 * 365);
    }
}
