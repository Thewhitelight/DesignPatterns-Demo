package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.cursor.ConcreteContainer;
import cn.libery.designpatterns.cursor.Container;
import cn.libery.designpatterns.cursor.Iterator;

public class CursorUnitTest {

    @Test
    public void cursorTest() throws Exception {
        Container<String> cs = new ConcreteContainer<>();
        cs.add("A");
        cs.add("B");
        cs.add("C");
        cs.add("D");
        Iterator<String> iterator = cs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}