package cn.libery.designpatterns.stragety;

/**
 * Created by ibery on 2017/2/21.
 */

public class SubwayStrategy implements CalculateStrategy {

    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 2;
        } else if (km < 6 && km <= 12) {
            return 4;
        } else if (km < 12 && km <= 22) {
            return 6;
        } else {
            return 8;
        }
    }
}
