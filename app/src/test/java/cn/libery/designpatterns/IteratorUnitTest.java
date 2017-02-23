package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.Iterator.Boss;
import cn.libery.designpatterns.Iterator.Director;
import cn.libery.designpatterns.Iterator.GroupLeader;
import cn.libery.designpatterns.Iterator.Manager;

public class IteratorUnitTest {

    @Test
    public void IteratorTest() throws Exception {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();
        groupLeader.nextLeader = director;
        director.nextLeader = manager;
        manager.nextLeader = boss;
        groupLeader.handleRequest(1000 * 10 * 4);
    }

}