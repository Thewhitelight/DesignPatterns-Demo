package cn.libery.designpatterns.Mediator;

/**
 * Created by ibery on 2017/3/5.
 */

public class BoardMediator extends Mediator {

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    private CPU cpu;
    private CDDevice cdDevice;
    private GPU gpu;
    private SoundCard soundCard;

    @Override
    public void changed(Colleague c) {
        if (c instanceof CDDevice){
            handleCD((CDDevice) c);
        }else if (c instanceof CPU){
            handleCPU((CPU) c);
        }
    }

    private void handleCPU(CPU c) {
        soundCard.soundPlay(c.getDataSound());
        gpu.videoPlay(c.getDataVideo());
    }

    private void handleCD(CDDevice c) {
        cpu.decodeData(c.read());
    }
}
