package cn.libery.designpatterns.visitor;

/**
 * Created by ibery on 2017/3/4.
 */

public interface Visitor {
    void visitor(Manger manger);

    void visitor(Engineer engineer);
}
