package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.adapter.Volt220;
import cn.libery.designpatterns.adapter.VoltAdapter1;
import cn.libery.designpatterns.adapter.VoltAdapter2;

public class AdapterUnitTest {

    @Test
    public void adapterTest() throws Exception {

        VoltAdapter1 adapter1=new VoltAdapter1();
        System.out.println("输出电压:"+adapter1.getVolt110());

        VoltAdapter2 adapter2=new VoltAdapter2(new Volt220());
        System.out.println("输出电压:"+adapter2.getVolt110());
    }

}