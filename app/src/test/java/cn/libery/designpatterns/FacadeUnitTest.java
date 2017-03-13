package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.facade.MobilePhone;

public class FacadeUnitTest {

    @Test
    public void facadeTest() throws Exception {
        MobilePhone phone=new MobilePhone();
        phone.dail();
        phone.hangup();

        phone.openCamera();
        phone.takePicture();
        phone.closeCamera();
    }

}