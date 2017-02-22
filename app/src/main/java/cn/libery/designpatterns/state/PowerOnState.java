package cn.libery.designpatterns.state;

/**
 * Created by ibery on 2017/2/22.
 */

public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void preChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("音量增大");
    }

    @Override
    public void turnDown() {
        System.out.println("音量减小");
    }
}
