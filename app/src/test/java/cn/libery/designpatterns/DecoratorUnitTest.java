package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.decorator.Boy;
import cn.libery.designpatterns.decorator.CheapCloth;
import cn.libery.designpatterns.decorator.ExpensiveCloth;
import cn.libery.designpatterns.decorator.Person;
import cn.libery.designpatterns.decorator.PersonCloth;

public class DecoratorUnitTest {

    @Test
    public void decoratorTest() throws Exception {
        Person person=new Boy();

        PersonCloth expensive=new ExpensiveCloth(person);
        expensive.dressed();
        System.out.println("------------");
        PersonCloth cheapCloth=new CheapCloth(person);
        cheapCloth.dressed();
    }

}