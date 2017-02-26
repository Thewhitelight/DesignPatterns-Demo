package cn.libery.designpatterns.command;

/**
 * Created by ibery on 2017/2/26.
 */

public class LeftCommand implements Command {
    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    private TetrisMachine machine;

    @Override
    public void execute() {
        machine.toLeft();
    }
}
