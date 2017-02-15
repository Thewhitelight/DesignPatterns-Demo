package cn.libery.designpatterns.singleton;

/**
 * Created by ibery on 2017/2/15.
 */

public class Singleton {

    private Singleton() {
        System.out.println("singleton");
    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        static final Singleton sInstance = new Singleton();
    }

}
