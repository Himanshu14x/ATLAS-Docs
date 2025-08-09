package PracticeSet.atlaslearnings.day25.Task02CompositeMethod;

public class Software implements Company{
        private int id;
        private String Name;

        public Software(int id, String Name){
            this.id = id;
            this.Name = Name;
        }

        public void displayName() {
            System.out.println(getClass().getSimpleName());
        }

    }

