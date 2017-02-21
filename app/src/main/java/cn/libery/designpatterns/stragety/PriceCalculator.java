package cn.libery.designpatterns.stragety;

/**
 * Created by ibery on 2017/2/21.
 */

public class PriceCalculator {

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    private CalculateStrategy calculateStrategy;

    public int calculatorPrice(int km) {
        return calculateStrategy.calculatePrice(km);
    }
}
