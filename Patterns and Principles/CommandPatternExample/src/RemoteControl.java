public class RemoteControl {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
        executeCommand();
    }
    void executeCommand(){
        command.execute();
    }
}
