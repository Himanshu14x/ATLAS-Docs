package PracticeSet.atlaslearnings.day25.Task04CommandPattern;

public class DontDoTask implements Command{
    private Task task;

    public DontDoTask(Task task) {
        this.task = task;
    }


    public void doIt() {
        this.task.dont();
    }
}