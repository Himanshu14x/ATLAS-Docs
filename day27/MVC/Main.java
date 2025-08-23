package PracticeSet.atlaslearnings.day27.MVC;

public class Main {
    public static void main(String[] args) {
        Student model = new Student("Himanshu", 101);

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("HR");

        controller.updateView();
    }
}
