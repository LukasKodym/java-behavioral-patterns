package pl.lukas;

import java.util.Observable;
import java.util.Observer;

public class App {

    public static void main(String[] args) {

        Observable observableValue = new Observable() {
            @Override
            public void notifyObservers(Object arg) {
                super.setChanged();
                super.notifyObservers(arg);
            }
        };

        observableValue.addObserver((observable, o) -> System.out.println("1 " + o.toString()));

        observableValue.addObserver(new Observer() {
            @Override
            public void update(Observable observable, Object o) {
                System.out.println("2 " + o.toString());
            }
        });

        observableValue.notifyObservers(54);
    }
}