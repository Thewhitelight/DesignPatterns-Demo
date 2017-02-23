package cn.libery.designpatterns.Iterator;

/**
 * Created by ibery on 2017/2/23.
 */

public class GroupLeader extends Leader {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("GroupLeader 报销" + money + "元");
    }
}
