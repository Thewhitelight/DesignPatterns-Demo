package cn.libery.designpatterns.command;

/**
 * Created by ibery on 2017/2/26.
 */

public class TetrisMachine {

    public void fastToBottom() {
        System.out.println("快速下落");
    }

    public void transform() {
        System.out.println("变化形状");
    }

    public void toLeft() {
        System.out.println("向左");
    }

    public void toRight() {
        System.out.println("向右");
    }

}
