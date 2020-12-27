package Meatball;

public class WithPita extends Meatball {
    public WithPita(){
        description = "Meatball with pita";
    }

    @Override
    public double cost() {
        return 24.95;
    }
}
