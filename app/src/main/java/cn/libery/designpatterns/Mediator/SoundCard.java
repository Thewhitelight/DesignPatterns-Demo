package cn.libery.designpatterns.Mediator;

/**
 * Created by ibery on 2017/3/5.
 */

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }
    public void soundPlay(String data){
        System.out.println("soundPlay:"+data);
    }
}
