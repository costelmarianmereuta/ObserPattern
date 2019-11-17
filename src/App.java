public class App {

    public static void main(String[] args) {
        ObservableImpl observable= new ObservableImpl();
        Observer observer=new ObserverImpl();

        observable.add(observer);
        observable.setState(12);

    }
}
