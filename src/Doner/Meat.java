package Doner;

public class Meat extends Doner{
    public Meat(){
        description = "Meat Doner Menu";
    }

    @Override
    public double cost() {
        return 12.95;
    }
}
