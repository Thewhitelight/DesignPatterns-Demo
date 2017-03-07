package cn.libery.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ibery on 2017/3/7.
 */

public class Composite extends Component {

    private List<Component> components=new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (components!=null){
            for (Component c : components) {
                c.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component component) {
        components.add(component);
    }

    @Override
    public void removeChild(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }
}
