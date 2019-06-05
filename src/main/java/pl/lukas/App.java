package pl.lukas;

import pl.lukas.observers.ObservableTempValue;

public class App {

    public static void main(String[] args) throws InterruptedException {

        ObservableTempValue observableValue = new ObservableTempValue();

        observableValue.addObserver((observable, o) -> System.out.println("1 " + o.toString()));
        observableValue.addObserver((observable, o) -> System.out.println("2 " + o.toString()));

        while (true) {
            Thread.sleep(500);
            observableValue.setValue((int) (observableValue.getOldTemp() + Math.random() * 6 - 2));
        }
    }
}