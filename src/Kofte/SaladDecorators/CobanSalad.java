package Kofte.SaladDecorators;

import Kofte.Kofte;
import Kofte.SaladDecorator;

public class CobanSalad extends SaladDecorator {
    Kofte kofte;

    public CobanSalad(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 8.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Coban Salad";
    }
}
