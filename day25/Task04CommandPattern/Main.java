package PracticeSet.atlaslearnings.day25.Task04CommandPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern - Behavioural DP");
        Task task = new Task();
        Mom remote = new Mom();

        Command onCommand = new DoTask(task);
        Command offCommand = new DontDoTask(task);

        remote.setCommand(onCommand);
        remote.executeCommand();

        remote.setCommand(offCommand);
        remote.executeCommand();

    }
}
