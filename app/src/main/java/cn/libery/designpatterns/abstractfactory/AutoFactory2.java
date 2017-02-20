package cn.libery.designpatterns.abstractfactory;

/**
 * Created by ibery on 2017/2/20.
 */

public class AutoFactory2 extends CarFactory {
    @Override
    public Tire createTire() {
        return new SUVTireImpl();
    }

    @Override
    public Engine createEngine() {
        return new ImportEngineImpl();
    }

    @Override
    public Brake createBrake() {
        return new SeniorBrakeImpl();
    }
}
