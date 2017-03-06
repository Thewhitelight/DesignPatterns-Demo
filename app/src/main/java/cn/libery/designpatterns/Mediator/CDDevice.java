package cn.libery.designpatterns.mediator;

/**
 * Created by ibery on 2017/3/5.
 */

public class CDDevice extends Colleague {

    private String[] datas;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }
    public String[] read(){
        return datas;
    }
    public void load(){
        datas=new String[]{"视频数据","音频数据"};
        mediator.changed(this);
    }
}
