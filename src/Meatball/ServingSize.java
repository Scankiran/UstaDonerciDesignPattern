package Meatball;

public class ServingSize extends Meatball {
    public ServingSize(){
        description = "Serving size Meatball";
    }

    @Override
    public double cost() {
        return 29.95;
    }
}
