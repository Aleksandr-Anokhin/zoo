package executable.delete;

import executable.CommandExecutable;
import zoo.Zoo;

public class DeleteLionEx implements CommandExecutable {
    private Zoo zoo;

    public DeleteLionEx(Zoo zoo) {

        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.takeOfLion();
    }
}
