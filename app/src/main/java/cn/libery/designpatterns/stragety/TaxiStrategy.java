package cn.libery.designpatterns.stragety;

/**
 * Created by ibery on 2017/2/21.
 */

public class TaxiStrategy implements CalculateStrategy {

    @Override
    public int calculatePrice(int km) {
        if (km <= 5) {
            return 11;
        } else {
            return (km - 5) * 3 + 11;
        }
    }

}
