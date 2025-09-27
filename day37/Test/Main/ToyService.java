package PracticeSet.atlaslearnings.day37.day37Test.Main;

public class ToyService {

    public String getToyName(int id) {
        if (id == 1) {
            return "Lego";
        } else {
            return getFallbackName();
        }
    }

    public String getFallbackName() {
        return "Unknown Toy";
    }
}
