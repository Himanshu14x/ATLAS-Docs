package PracticeSet.atlaslearnings.day28.StrategyPattern;

import java.util.List;

public class LengthSort implements SortingStrategy{
    @Override
    public void sort(List<String> items) {
        int n = items.size();
        for(int i =0; i<n-1; i++){
            for (int j = 0; j < n-i-1; j++) {
                if(items.get(j).length()>items.get(j+1).length()){
                    String temp = items.get(j);
                    items.set(j, items.get(j+1));
                    items.set(j+1, temp);
                }
            }
        }
    }
}
