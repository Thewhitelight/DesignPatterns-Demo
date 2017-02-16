package cn.libery.designpatterns.builder;

/**
 * Created by ibery on 2017/2/16.
 */

public class AutoBuilder extends Builder {

    private Car mCar = new AutoCar();

    @Override
    public void buildEngine(String engine) {
        mCar.setEngine(engine);
    }

    @Override
    public void buildTires(String tires) {
        mCar.setTires(tires);
    }

    @Override
    public void buildBody() {
        mCar.setBody();
    }

    @Override
    public Car build() {
        return mCar;
    }

}
