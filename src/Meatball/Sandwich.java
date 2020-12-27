package Meatball;

public class Sandwich extends Meatball {
    public Sandwich(){
        description = "Sandwich Meatball";
    }

    @Override
    public double cost() {
        return 19.95;
    }
}
