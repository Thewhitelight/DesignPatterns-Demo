package cn.libery.designpatterns.decorator;

/**
 * Created by ibery on 2017/3/9.
 */

public abstract class PersonCloth extends Person {
    protected  Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }

    @Override
    public void dressed() {
        person.dressed();
    }
}
