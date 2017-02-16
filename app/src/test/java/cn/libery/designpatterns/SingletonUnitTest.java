package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.singleton.Singleton;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SingletonUnitTest {

    @Test
    public void singletonTest() throws Exception {
        assertEquals(Singleton.getInstance(),Singleton.getInstance());
    }

}