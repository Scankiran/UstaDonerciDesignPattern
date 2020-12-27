package Meatball;

public class WithFive extends Meatball {
    public WithFive(){
        description = "Five piece of meatball";
    }

    @Override
    public double cost() {
        return 19.95;
    }
}
