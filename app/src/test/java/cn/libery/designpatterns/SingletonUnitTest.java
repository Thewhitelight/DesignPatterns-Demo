package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.singleton.Singleton;

import static org.junit.Assert.*;

public class SingletonUnitTest {

    @Test
    public void singletonTest() throws Exception {
        assertEquals(Singleton.getInstance(),Singleton.getInstance());
    }

}