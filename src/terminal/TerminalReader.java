package terminal;

import executable.CommandExecutable;
import executable.factory.CommandExecutableFactory;
import executable.factory.CommandExecutableFactoryImpl;
import zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;
    private zoo.Zoo Zoo;

    private TerminalReader(CommandParser commandParser) {

        this.commandParser = commandParser;
    }
    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }
    public void listenToCommands() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            Command commands = commandParser.parseCommand(input);

            CommandExecutableFactoryImpl commandExecutableFactory = new CommandExecutableFactoryImpl(Zoo);
            // по посказке программы добавил строку: private zoo.Zoo Zoo;
            CommandExecutable commandExecutable = commandExecutableFactory.create(commands);
            commandExecutable.execute();
        }
    }


}
