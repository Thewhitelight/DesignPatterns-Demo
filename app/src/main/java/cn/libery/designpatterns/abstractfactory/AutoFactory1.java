package cn.libery.designpatterns.abstractfactory;

/**
 * Created by ibery on 2017/2/20.
 */

public class AutoFactory1 extends CarFactory {
    @Override
    public Tire createTire() {
        return new NormalTireImpl();
    }

    @Override
    public Engine createEngine() {
        return new DomesticEngineImpl();
    }

    @Override
    public Brake createBrake() {
        return new NormalBrakeImpl();
    }
}
