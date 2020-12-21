package Kofte.SosDecorators;

import Kofte.Kofte;
import Kofte.SosDecorator;

public class Ketchup extends SosDecorator {
    Kofte kofte;

    public Ketchup(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 0.50 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Ketchup";
    }
}
