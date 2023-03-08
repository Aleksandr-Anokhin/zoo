package terminal;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }
    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    void endless() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(zoo.toString() + "\n");
            new InviteMessage().consoleMessage();
            String input = scanner.nextLine();
            if (input.equals("stop")) break;
            if (isCheck(input)) {
                Command newCommand = this.commandParser.parseCommand(input);
                this.setCommandExecutable(newCommand);
                this.commandExecutable.execute();
            } else {
                new ErrorMessage().consoleMessage();
            }
        }
        scanner.close();
    }
}
