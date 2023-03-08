package executable.factory;
import terminal.executable.CommandExecutable;
public interface CommandExecutableFactory {
    CommandExecutable create(Command input);
}
