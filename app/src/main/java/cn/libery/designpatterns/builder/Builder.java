package cn.libery.designpatterns.builder;

/**
 * Created by ibery on 2017/2/16.
 */

public abstract class Builder {
    public abstract void buildEngine(String engine);

    public abstract void buildTires(String tires);

    public abstract void buildBody();

    public abstract Car build();
}
