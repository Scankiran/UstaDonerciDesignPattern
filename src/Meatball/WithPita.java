package Meatball;

public class WithPita extends Meatball {
    public WithPita(){
        description = "Sandwich Kofte";
    }

    @Override
    public double cost() {
        return 24.95;
    }
}
