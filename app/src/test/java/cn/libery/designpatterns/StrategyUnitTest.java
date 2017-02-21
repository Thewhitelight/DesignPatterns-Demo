package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.stragety.BusStrategy;
import cn.libery.designpatterns.stragety.PriceCalculator;
import cn.libery.designpatterns.stragety.SubwayStrategy;
import cn.libery.designpatterns.stragety.TaxiStrategy;

public class StrategyUnitTest {

    @Test
    public void strategyTest() throws Exception {
        PriceCalculator calculator = new PriceCalculator();
        calculator.setCalculateStrategy(new BusStrategy());
        int km = 18;
        System.out.println("公交" + km + "Km,花费" + calculator.calculatorPrice(km) + "元");
        calculator.setCalculateStrategy(new SubwayStrategy());
        System.out.println("地铁" + km + "Km,花费" + calculator.calculatorPrice(km) + "元");
        calculator.setCalculateStrategy(new TaxiStrategy());
        System.out.println("出租车" + km + "Km,花费" + calculator.calculatorPrice(km) + "元");
    }

}