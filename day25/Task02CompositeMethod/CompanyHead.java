package PracticeSet.atlaslearnings.day25.Task02CompositeMethod;
import java.util.ArrayList;
import java.util.List;
public class CompanyHead implements Company{
        private int id;
        private String name;
        private List<Company> subDepartments;

        public CompanyHead(int id, String name) {
            this.id = id;
            this.name= name;
            this.subDepartments = new ArrayList<>();
        }

        public void displayName() {
            System.out.println(name);
            subDepartments.forEach(Company::displayName);
        }

        public void addDepartments(Company company) {
            subDepartments.add(company);
        }

    }

