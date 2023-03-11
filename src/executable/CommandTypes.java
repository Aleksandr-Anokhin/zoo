package executable;
import executable.create.CreateLionEx;
import executable.delete.DeleteLionEx;

public class CommandTypes {
    LION_DELETE("liondelete", 2, new DeleteLionEx());
    LION_CREATE("lioncreate", 6 , new CreateLionEx());


    private final String title;

    private final int args;

    private CommandExecutable method;
    CommandTypes(String wolfdelete, int i, CommandExecutable method) {
        this.title = wolfdelete;
        this.args = i;
        this.method = method;
    }



    public String getTitle() {
        return title;
    }

    public int getArgs() {
        return args;
    }

    public CommandExecutable getMethod() {
        return method;
    }

    public boolean checkType(String animal, String action){
        return title.equals(animal + action);
    }
}
