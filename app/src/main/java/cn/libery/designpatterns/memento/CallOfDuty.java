package cn.libery.designpatterns.memento;

/**
 * Created by ibery on 2017/2/28.
 */

public class CallOfDuty {

    private int checkPoint = 1;

    private int lifeValue = 100;
    private String weapon = "M4A1";

    public void play() {
        System.out.println("Game Start checkPoint:" + checkPoint);
        checkPoint++;
        lifeValue -= 5;
        System.out.println(toString());
    }

    public void quit() {
        System.out.println("Game End");
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "checkPoint=" + checkPoint +
                ", lifeValue=" + lifeValue +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.checkPoint = this.checkPoint;
        memento.lifeValue = this.lifeValue;
        memento.weapon = this.weapon;
        return memento;
    }

    public void restore(Memento memento) {
        this.checkPoint = memento.checkPoint;
        this.lifeValue = memento.lifeValue;
        this.weapon = memento.weapon;
        System.out.println("Game Restore:" + toString());
    }
}
