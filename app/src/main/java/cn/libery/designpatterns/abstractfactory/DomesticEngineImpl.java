package cn.libery.designpatterns.abstractfactory;

/**
 * Created by ibery on 2017/2/20.
 */

public class DomesticEngineImpl implements Engine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
