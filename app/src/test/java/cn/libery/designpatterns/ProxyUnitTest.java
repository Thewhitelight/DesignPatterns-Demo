package cn.libery.designpatterns;

import org.junit.Test;

import java.lang.reflect.Proxy;

import cn.libery.designpatterns.proxy.DynamicProxy;
import cn.libery.designpatterns.proxy.Lawsuit;
import cn.libery.designpatterns.proxy.Lawyer;
import cn.libery.designpatterns.proxy.XiaoHua;

public class ProxyUnitTest {

    @Test
    public void proxyTest() throws Exception {
        Lawsuit xiaoHua=new XiaoHua();
        Lawsuit lawyer=new Lawyer(xiaoHua);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();

        System.out.println("----------------------------------");

        DynamicProxy proxy=new DynamicProxy(xiaoHua);
        ClassLoader loader=xiaoHua.getClass().getClassLoader();
        Lawsuit lawyer2= (Lawsuit) Proxy.newProxyInstance(loader,new Class[]{Lawsuit.class},proxy);
        lawyer2.submit();
        lawyer2.burden();
        lawyer2.defend();
        lawyer2.finish();
    }

}