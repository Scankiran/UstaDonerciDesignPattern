package Kofte;

public class Sandwich extends Kofte{
    public Sandwich(){
        description = "Sandwich Kofte";
    }

    @Override
    public double cost() {
        return 19.95;
    }
}
