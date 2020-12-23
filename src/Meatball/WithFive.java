package Meatball;

public class WithFive extends Meatball {
    public WithFive(){
        description = "Sandwich Kofte";
    }

    @Override
    public double cost() {
        return 19.95;
    }
}
