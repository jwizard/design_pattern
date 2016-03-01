package Memento.tutorialspoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jwizard on 2016. 2. 23..
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
