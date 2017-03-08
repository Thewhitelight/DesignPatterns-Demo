package cn.libery.designpatterns.adapter;

/**
 * Created by ibery on 2017/3/8.
 */

public class VoltAdapter1 extends Volt220 implements Volt110 {
    @Override
    public int getVolt110() {
        return 110;
    }
}
