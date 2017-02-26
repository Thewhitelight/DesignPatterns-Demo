package cn.libery.designpatterns.command;

/**
 * Created by ibery on 2017/2/26.
 */

public class RightCommand implements Command {

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    private TetrisMachine machine;

    @Override
    public void execute() {
        machine.toRight();
    }
}
