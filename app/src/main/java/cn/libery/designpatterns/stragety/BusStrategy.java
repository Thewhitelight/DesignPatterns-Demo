package cn.libery.designpatterns.stragety;

/**
 * Created by ibery on 2017/2/21.
 */

public class BusStrategy implements CalculateStrategy {

    @Override
    public int calculatePrice(int km) {
        if (km <= 10) {
            return 1;
        } else {
            return 1 + (km - 10) / 5 + 1;
        }
    }

}
