package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.template.AbsComputer;
import cn.libery.designpatterns.template.CoderComputer;
import cn.libery.designpatterns.template.MilitaryComputer;

public class TemplateUnitTest {

    @Test
    public void templateTest() throws Exception {
        AbsComputer coder=new CoderComputer();
        coder.startUp();
        AbsComputer military=new MilitaryComputer();
        military.startUp();
    }

}