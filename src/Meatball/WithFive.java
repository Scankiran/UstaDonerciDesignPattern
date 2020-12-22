package Meatball;

public class WithFive extends Kofte{
    public WithFive(){
        description = "Sandwich Kofte";
    }

    @Override
    public double cost() {
        return 19.95;
    }
}
