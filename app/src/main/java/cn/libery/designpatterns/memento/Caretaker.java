package cn.libery.designpatterns.memento;

/**
 * Created by ibery on 2017/2/28.
 */

public class Caretaker {
    public Memento getMemento() {
        return memento;
    }

    private Memento memento;

    public void archive(Memento memento) {
        this.memento = memento;
    }
}
