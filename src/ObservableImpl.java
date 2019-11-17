import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state=10;
    private List<Observer> observers=new ArrayList<>();
    @Override
    public void add(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void delete(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(this);
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObserver();
    }
}
