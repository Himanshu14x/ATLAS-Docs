package PracticeSet.atlaslearnings.day25.Task02CompositeMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Composite Method DP - Structural DP");
        Company softwareCompany = new Software(1, "software");

        CompanyHead companyHead = new CompanyHead(3, "abcCompany");
        companyHead.addDepartments(softwareCompany);
        companyHead.displayName();
    }
}
