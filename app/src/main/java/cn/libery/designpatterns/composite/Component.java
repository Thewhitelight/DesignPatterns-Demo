package cn.libery.designpatterns.composite;

/**
 * Created by ibery on 2017/3/7.
 */

public abstract class Component {
    protected String  name;

    public Component(String name) {
        this.name = name;
    }
    public abstract void doSomething();
    public abstract void addChild(Component component);
    public abstract void removeChild(Component component);
    public abstract Component getChild(int index);
}
