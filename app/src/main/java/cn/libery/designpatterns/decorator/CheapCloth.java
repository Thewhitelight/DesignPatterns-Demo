package cn.libery.designpatterns.decorator;

/**
 * Created by ibery on 2017/3/9.
 */

public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
    }

    private void dressShirt() {
        System.out.println("穿短袖");
    }
}
