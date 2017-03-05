package cn.libery.designpatterns.Mediator;

/**
 * Created by ibery on 2017/3/5.
 */

public class GPU extends Colleague {
    public GPU(Mediator mediator) {
        super(mediator);
    }
    public void videoPlay(String data){
        System.out.println("videoPlay:"+data);
    }
}
