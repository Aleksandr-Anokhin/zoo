package executable.create;

import animals.Lion;
import executable.CommandExecutable;
import terminal.Command;
import zoo.Zoo;

import java.util.ArrayList;

public class CreateLionEx implements CommandExecutable {
    private Zoo zoo;
    private Lion lion;


    public CreateLionEx(Zoo zoo, Command command) {
        ArrayList<String> input = command.getParameters();
        this.zoo = zoo;
        this.lion = new Lion(input.get(0), Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)), 4,
                Integer.parseInt(input.get(3)));
    }


    public CreateLionEx getZoo(Zoo zoo, Command command) {
        return new CreateLionEx(zoo, command);
    }

    @Override
    public void execute() {
        this.zoo.addLion(lion);
    }
}
