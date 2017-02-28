package cn.libery.designpatterns.memento;

/**
 * Created by ibery on 2017/2/28.
 */

public class Memento {
    public int checkPoint;
    public int lifeValue;
    public String weapon;

    @Override
    public String toString() {
        return "Memento{" +
                "checkPoint=" + checkPoint +
                ", lifeValue=" + lifeValue +
                ", weapon='" + weapon + '\'' +
                '}';
    }

}
