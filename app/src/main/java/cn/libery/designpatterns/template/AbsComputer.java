package cn.libery.designpatterns.template;

/**
 * Created by ibery on 2017/3/2.
 */

public abstract class AbsComputer {

    public final void startUp() {
        System.out.println("--开机 start--");
        powerOn();
        checkHardware();
        loadOS();
        login();
        System.out.println("--开机 end--");
    }

    protected abstract void login();

    protected void loadOS() {
        System.out.println("载入系统");
    }

    protected void checkHardware() {
        System.out.println("检查硬件");
    }

    protected void powerOn() {
        System.out.println("开启电源");
    }
}
