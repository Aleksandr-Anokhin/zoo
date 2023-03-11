package executable.delete;

import executable.CommandExecutable;
import zoo.Zoo;

public class DeleteLionEx implements CommandExecutable {
    // Class 'DeleteLionEx' must either be declared abstract or
    // implement abstract method 'getZoo(Zoo, Command)' in 'CommandExecutable'
    private Zoo zoo;

    public DeleteLionEx(Zoo zoo) {

        this.zoo = zoo;
    }


 /*
    public  DeleteLionEx getZoo(Zoo zoo, Command command) {
        return new DeleteLionEx(zoo);
    }  //это лишнее. можно напрямую вызывать конструктор и не передавать ему лишний параметр.

 */
    @Override
    public void execute() {
        this.zoo.takeOfLion();
    }
}
