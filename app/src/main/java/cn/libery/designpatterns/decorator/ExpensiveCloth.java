package cn.libery.designpatterns.decorator;

/**
 * Created by ibery on 2017/3/9.
 */

public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }

    private void dressJean() {
        System.out.println("穿牛仔裤");
    }

    private void dressLeather() {
        System.out.println("穿皮衣");
    }

    private void dressShirt() {
        System.out.println("穿短袖");
    }
}
