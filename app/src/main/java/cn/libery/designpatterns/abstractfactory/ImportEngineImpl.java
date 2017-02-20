package cn.libery.designpatterns.abstractfactory;

/**
 * Created by ibery on 2017/2/20.
 */

public class ImportEngineImpl implements Engine {
    @Override
    public void engine() {
        System.out.println("进口发动机");
    }
}
