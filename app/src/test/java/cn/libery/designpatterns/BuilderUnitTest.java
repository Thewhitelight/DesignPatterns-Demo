package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.builder.AutoBuilder;
import cn.libery.designpatterns.builder.Builder;
import cn.libery.designpatterns.builder.Car;

public class BuilderUnitTest {

    @Test
    public void builderTest() throws Exception {
        Builder builder = new AutoBuilder();
        builder.buildEngine("engine");
        builder.buildTires("tires");
        builder.buildBody();
        Car autoCar=builder.build();
        System.out.println(autoCar.toString());
    }

}