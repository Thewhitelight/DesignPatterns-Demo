package cn.libery.designpatterns.cursor;

/**
 * Created by ibery on 2017/3/1.
 */

public interface Iterator<T> {
    boolean hasNext();

    T next();
}
