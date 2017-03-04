package cn.libery.designpatterns.visitor;

/**
 * Created by ibery on 2017/3/4.
 */

public class CEOVisitor implements Visitor {

    @Override
    public void visitor(Manger manger) {
        System.out.println("name:" + manger.name + " kpi:" + manger.kpi);
    }

    @Override
    public void visitor(Engineer engineer) {
        System.out.println("name:" + engineer.name + " kpi:" + engineer.kpi);
    }
}
