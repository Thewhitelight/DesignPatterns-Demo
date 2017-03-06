package cn.libery.designpatterns.proxy;

/**
 * Created by ibery on 2017/3/6.
 */

public class XiaoHua implements Lawsuit {

    @Override
    public void submit() {
        System.out.println("劳务纠纷，申请仲裁");
    }

    @Override
    public void burden() {
        System.out.println("合同，银行流水");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿");
    }

    @Override
    public void finish() {
        System.out.println("即日起七日内结算工资");
    }

}
