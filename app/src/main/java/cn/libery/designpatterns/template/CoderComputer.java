package cn.libery.designpatterns.template;

/**
 * Created by ibery on 2017/3/2.
 */

public class CoderComputer extends AbsComputer {
    @Override
    protected void login() {
        System.out.println("输入PIN码");
    }
}
