package cn.libery.designpatterns.template;

/**
 * Created by ibery on 2017/3/2.
 */

public class MilitaryComputer extends AbsComputer {
    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙");
    }

    @Override
    protected void login() {
        System.out.println("指纹识别");
    }
}
