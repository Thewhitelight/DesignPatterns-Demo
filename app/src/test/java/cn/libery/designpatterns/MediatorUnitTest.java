package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.mediator.BoardMediator;
import cn.libery.designpatterns.mediator.CDDevice;
import cn.libery.designpatterns.mediator.CPU;
import cn.libery.designpatterns.mediator.GPU;
import cn.libery.designpatterns.mediator.SoundCard;

public class MediatorUnitTest {

    @Test
    public void mediatorTest() throws Exception {

        BoardMediator mediator=new BoardMediator();
        CDDevice cdDevice=new CDDevice(mediator);
        CPU cpu=new CPU(mediator);
        GPU gpu=new GPU(mediator);
        SoundCard soundCard=new SoundCard(mediator);
        mediator.setCdDevice(cdDevice);
        mediator.setCpu(cpu);
        mediator.setGpu(gpu);
        mediator.setSoundCard(soundCard);
        cdDevice.load();

    }

}