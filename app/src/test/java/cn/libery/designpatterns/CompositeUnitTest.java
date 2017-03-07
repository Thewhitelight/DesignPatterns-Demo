package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.composite.Component;
import cn.libery.designpatterns.composite.Composite;
import cn.libery.designpatterns.composite.Leaf;

public class CompositeUnitTest {

    @Test
    public void compositeTest() throws Exception {
        Component root=new Composite("ROOT");

        Component branch1=new Composite("BRANCH1");
        Component branch2=new Composite("BRANCH2");

        Component leaf1=new Leaf("LEAF1");
        Component leaf2=new Leaf("LEAF2");

        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        root.addChild(branch1);
        root.addChild(branch2);

        root.doSomething();
    }

}