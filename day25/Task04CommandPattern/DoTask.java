package PracticeSet.atlaslearnings.day25.Task04CommandPattern;

public class DoTask implements Command{
    private Task task;

    public DoTask(Task task) {
        this.task = task;
    }


    public void doIt() {
        this.task.doo();
    }
}
