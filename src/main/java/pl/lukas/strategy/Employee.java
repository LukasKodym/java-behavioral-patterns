package pl.lukas.strategy;

public class Employee implements TravelStrategy, JobStrategy, BreakfastStrategy {

    public TravelStrategy travelStrategy;
    public JobStrategy jobStrategy;
    public BreakfastStrategy breakfastStrategy;

    @Override
    public void eatYourBreakfast(Employee e) {
        breakfastStrategy.eatYourBreakfast(e);
    }

    @Override
    public void doYourJob() {
        jobStrategy.doYourJob();
    }

    @Override
    public void goToWork() {
        travelStrategy.goToWork();
    }
}
