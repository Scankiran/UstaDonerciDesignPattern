package Commands;

public class Waitress {
    Command command;
    public void takeOrder(Command command) {
        this.command = command;
        command.orderUp();
    }
}
