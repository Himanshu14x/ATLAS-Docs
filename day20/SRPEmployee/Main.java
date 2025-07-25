package PracticeSet.atlaslearnings.day20.SRPEmployee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "alice@example.com", 50000);

        EmployeeReportGenerator reportGenerator = new EmployeeReportGenerator();
        reportGenerator.generatePdfReport(emp);

        EmployeeEmailService emailService = new EmployeeEmailService();
        emailService.sendEmail(emp);
    }
}
