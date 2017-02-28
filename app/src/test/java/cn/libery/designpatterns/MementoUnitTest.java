package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.memento.CallOfDuty;
import cn.libery.designpatterns.memento.Caretaker;

public class MementoUnitTest {

    @Test
    public void mementoTest() throws Exception {
        CallOfDuty game = new CallOfDuty();
        game.play();
        game.quit();
        Caretaker caretaker = new Caretaker();
        caretaker.archive(game.createMemento());

        CallOfDuty restoreGame = new CallOfDuty();
        restoreGame.restore(caretaker.getMemento());
        restoreGame.play();
    }

}