package executable.factory;
import executable.CommandTypes;
import executable.create.CreateLionEx;
import executable.delete.DeleteLionEx;
import terminal.Command;
import executable.CommandExecutable;
import zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command input) {
        CommandTypes codeEnum = input.getCommandEnum();
        CommandExecutable exec = codeEnum.getMethod();
        return exec.getZoo(zoo, input);
    }
}
