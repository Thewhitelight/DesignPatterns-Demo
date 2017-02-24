package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.iterator.Boss;
import cn.libery.designpatterns.iterator.Director;
import cn.libery.designpatterns.iterator.GroupLeader;
import cn.libery.designpatterns.iterator.Manager;

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