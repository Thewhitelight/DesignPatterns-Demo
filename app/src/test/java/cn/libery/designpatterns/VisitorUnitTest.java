package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.visitor.BusinessReport;
import cn.libery.designpatterns.visitor.CEOVisitor;
import cn.libery.designpatterns.visitor.CTOVisitor;

public class VisitorUnitTest {

    @Test
    public void visitorTest() throws Exception {
        BusinessReport report = new BusinessReport();
        System.out.println("---CEO Report---");
        report.showReport(new CEOVisitor());
        System.out.println("---CTO Report---");
        report.showReport(new CTOVisitor());
    }

}