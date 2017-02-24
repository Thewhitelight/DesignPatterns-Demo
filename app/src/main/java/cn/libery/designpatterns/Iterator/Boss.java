package cn.libery.designpatterns.iterator;

/**
 * Created by ibery on 2017/2/23.
 */

public class Boss extends Leader {
    @Override
    public int limit() {
        return 1000 * 10 * 10 * 10;
    }

    @Override
    public void handle(int money) {
        System.out.println("Boss 报销" + money + "元");
    }
}
