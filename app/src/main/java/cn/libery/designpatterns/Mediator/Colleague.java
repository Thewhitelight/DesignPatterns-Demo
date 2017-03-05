package cn.libery.designpatterns.Mediator;

/**
 * Created by ibery on 2017/3/5.
 */

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
