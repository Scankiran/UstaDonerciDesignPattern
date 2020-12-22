package Meatball;

public class ServingSize extends Kofte{
    public ServingSize(){
        description = "Sandwich Kofte";
    }

    @Override
    public double cost() {
        return 29.95;
    }
}
