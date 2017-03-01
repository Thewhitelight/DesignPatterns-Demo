package cn.libery.designpatterns.cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ibery on 2017/3/1.
 */

public class ConcreteContainer<T> implements Container<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}
