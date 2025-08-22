package PracticeSet.atlaslearnings.day26.SingletonPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class DManager {
    private static DManager instance;
    private List<String>dataList;

    private DManager(){
        dataList = Collections.synchronizedList(new ArrayList<>());
    }

    public static synchronized DManager getInstance(){
        if(instance==null){
            instance = new DManager();
        }
        return instance;
    }

    public synchronized void addItem(String item){
        dataList.add(item);
    }
    public synchronized void removeItem(String item){
        dataList.remove(item);
    }

    public synchronized List<String> getItems(){
        return new ArrayList<>(dataList);
    }
}
