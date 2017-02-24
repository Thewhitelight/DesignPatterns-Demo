package cn.libery.designpatterns.iterator;

/**
 * Created by ibery on 2017/2/23.
 */

public class Director extends Leader {
    @Override
    public int limit() {
        return 1000 * 10;
    }

    @Override
    public void handle(int money) {
        System.out.println("Director 报销" + money + "元");
    }
}
