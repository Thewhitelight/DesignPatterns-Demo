package cn.libery.designpatterns.cursor;

/**
 * Created by ibery on 2017/3/1.
 */

public interface Container<T> {

    void add(T t);

    void remove(T t);

    Iterator<T> iterator();

}
