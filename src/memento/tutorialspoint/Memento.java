package memento.tutorialspoint;

/**
 * Created by jwizard on 2016. 2. 23..
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
