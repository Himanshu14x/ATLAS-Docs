package PracticeSet.atlaslearnings.day25.Task04CommandPattern;

public class Mom {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        this.command.doIt();
    }
}