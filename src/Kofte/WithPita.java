package Kofte;

public class WithPita extends Kofte{
    public WithPita(){
        description = "Sandwich Kofte";
    }

    @Override
    public double cost() {
        return 24.95;
    }
}
