
public class ObserverImpl implements Observer {

    @Override
    public void update(Observable o) {

        int state=((ObservableImpl)o).getState();
        if (state%2==0){
            System.out.println("pair");
        }else {
            System.out.println("impair");
        }
        System.out.println("test");
    }
}
