package memento.scotty83_tistory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jwizard on 2016. 2. 23..
 */
public class Memento {
    int money;
    ArrayList<String> fruits;

    //narrow interface
    public int getMoney() {
        return money;
    }

    //wide interface
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<String>();
    }

    //wide interface
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    //wide interface
    @SuppressWarnings("unchecked")
    List<String> getFruits() {
        return (List<String>) fruits.clone();
    }
}
