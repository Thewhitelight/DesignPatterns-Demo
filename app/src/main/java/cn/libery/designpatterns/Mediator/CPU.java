package cn.libery.designpatterns.mediator;

import android.support.annotation.Size;

/**
 * Created by ibery on 2017/3/5.
 */

public class CPU extends Colleague {

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    private String dataVideo,dataSound;

    public CPU(Mediator mediator) {
        super(mediator);
    }
    public void decodeData(@Size(min = 2,max = 2) String[]  data){
        dataVideo=data[0];
        dataSound=data[1];
        mediator.changed(this);
    }
}
