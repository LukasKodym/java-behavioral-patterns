package pl.lukas;

import pl.lukas.observers.ObservableTempValue;
import pl.lukas.strategy.*;

public class App {

    public static void main(String[] args) throws InterruptedException {

        // observer pattern

        ObservableTempValue observableValue = new ObservableTempValue();

        observableValue.addObserver((observable, o) -> System.out.println("1 " + o.toString()));
        observableValue.addObserver((observable, o) -> System.out.println("2 " + o.toString()));

//        while (true) {
//            Thread.sleep(500);
//            observableValue.setValue((int) (observableValue.getOldTemp() + Math.random() * 6 - 2));
//        }

        // strategy pattern

        Employee mike = new Employee();

        mike.travelStrategy = new BikeTravelStrategy();
        mike.jobStrategy = new DoctorJobStrategy();
        mike.breakfastStrategy = new SandwichBreakfastStrategy();

        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast(mike);

        mike.travelStrategy = new CarTravelStrategy();
        mike.goToWork();

        return;
    }
}