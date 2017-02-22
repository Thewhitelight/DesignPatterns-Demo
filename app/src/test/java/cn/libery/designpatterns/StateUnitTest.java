package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.state.TvController;

public class StateUnitTest {

    @Test
    public void stateTest() throws Exception {
        TvController controller = new TvController();
        controller.powerOn();
        controller.nextChannel();
        controller.turnUp();
        controller.powerOff();
    }

}