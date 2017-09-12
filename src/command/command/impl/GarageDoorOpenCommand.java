package command.command.impl;

import command.client.GarageDoor;
import command.command.Command;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor=garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }

    @Override
    public void undo() {
        garageDoor.off();
    }
}
