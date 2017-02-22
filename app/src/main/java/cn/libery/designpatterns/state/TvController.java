package cn.libery.designpatterns.state;

/**
 * Created by ibery on 2017/2/22.
 */

public class TvController implements PowerController, TvState {

    private TvState state;

    @Override
    public void powerOn() {
        state = new PowerOnState();
        System.out.println("开机");
    }

    @Override
    public void powerOff() {
        state = new PowerOffState();
        System.out.println("关机");
    }

    @Override
    public void nextChannel() {
        state.nextChannel();
    }

    @Override
    public void preChannel() {
        state.preChannel();
    }

    @Override
    public void turnUp() {
        state.turnUp();
    }

    @Override
    public void turnDown() {
        state.turnDown();
    }
}
