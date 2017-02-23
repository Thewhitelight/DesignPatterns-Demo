package cn.libery.designpatterns.Iterator;

/**
 * Created by ibery on 2017/2/23.
 */

public abstract class Leader {

    public Leader nextLeader;

    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (nextLeader != null) {
                nextLeader.handleRequest(money);
            }
        }
    }

    public abstract int limit();

    public abstract void handle(int money);
}
