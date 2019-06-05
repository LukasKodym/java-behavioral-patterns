package pl.lukas.strategy;

public class DoctorJobStrategy implements JobStrategy {
    @Override
    public void doYourJob() {
        System.out.println("Cure people");
    }
}
