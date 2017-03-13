package cn.libery.designpatterns.facade;

/**
 * Created by ibery on 2017/3/13.
 */

public class MobilePhone {
    private Phone phone=new PhoneImpl();
    private Camera camera=new CameraImpl();
    public void dail(){
        phone.dail();
    }
    public void hangup(){
        phone.hangup();
    }
    public void openCamera(){
        camera.open();
    }
    public void takePicture(){
        camera.takePicture();
    }
    public void closeCamera(){
        camera.close();
    }
}
