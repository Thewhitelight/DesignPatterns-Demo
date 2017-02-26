package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.command.Buttons;
import cn.libery.designpatterns.command.FastToBottomCommand;
import cn.libery.designpatterns.command.LeftCommand;
import cn.libery.designpatterns.command.TetrisMachine;
import cn.libery.designpatterns.command.TransformCommand;

public class CommandUnitTest {

    @Test
    public void factoryTest() throws Exception {

        TetrisMachine machine = new TetrisMachine();
        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);
        FastToBottomCommand fastToBottomCommand = new FastToBottomCommand(machine);
        TransformCommand transformCommand = new TransformCommand(machine);

        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFastToBottomCommand(fastToBottomCommand);
        buttons.setTransformCommand(transformCommand);

        buttons.toLeft();
        buttons.toRight();
        buttons.transformCommand();
        buttons.fastToBottomCommand();
    }

}