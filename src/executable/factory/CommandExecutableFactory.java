package executable.factory;

import executable.CommandExecutable;
import terminal.Command;
import zoo.Zoo;

public interface  CommandExecutableFactory {
    CommandExecutable create(Command input);
}
