package cn.libery.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ibery on 2017/3/4.
 */

public class BusinessReport {
    private List<Staff> list = new ArrayList<>();

    public BusinessReport() {
        list.add(new Manger("Zhang PM"));
        list.add(new Manger("Wang PM"));
        list.add(new Engineer("Li Engineer"));
        list.add(new Engineer("Zhao Engineer"));
        list.add(new Engineer("Chen Engineer"));
    }

    public void showReport(Visitor v) {
        for (Staff s : list) {
            s.accept(v);
        }
    }
}
