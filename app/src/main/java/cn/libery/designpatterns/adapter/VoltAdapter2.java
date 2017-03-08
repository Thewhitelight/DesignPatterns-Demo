package cn.libery.designpatterns.adapter;

/**
 * Created by ibery on 2017/3/8.
 */

public class VoltAdapter2  implements Volt110 {

    private Volt220 volt220;

    public VoltAdapter2(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt110() {
        return 110;
    }
    public int getVolt220(){
        return  volt220.getVolt220();
    }

}
