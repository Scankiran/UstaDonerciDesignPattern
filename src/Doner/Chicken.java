package Doner;

public class Chicken extends Doner{
    public Chicken(){
        description = "Chicken Doner Menu";
    }

    @Override
    public double cost() {
        return 7.95;
    }
}
