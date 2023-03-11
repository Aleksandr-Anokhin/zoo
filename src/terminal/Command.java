package terminal;

import executable.CommandTypes;

import java.util.ArrayList;

public class Command {
    private String action;
    private String animal;
    private ArrayList<String> parameters;

    public String getAction() {
        return action;
    }

    public String getAnimal() {
        return animal;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public Command(String animal, String action, ArrayList<String> parameters) {
        this.animal = animal;
        this.action = action;
        this.parameters = parameters;
    }

    public CommandTypes getCommandEnum(){
        for (CommandTypes x: CommandTypes.values())  //Cannot resolve method 'values' in 'CommandTypes'
        {
            if(x.checkType(this.animal, this.action)){
                return (CommandTypes) x;
            }
        }
        return null;
    }
}
