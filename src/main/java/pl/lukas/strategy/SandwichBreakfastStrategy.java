package pl.lukas.strategy;

public class SandwichBreakfastStrategy implements BreakfastStrategy {
    @Override
    public void eatYourBreakfast(Employee e) {
        System.out.println("Eat sandwich");
    }
}
