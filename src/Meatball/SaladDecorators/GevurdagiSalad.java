package Meatball.SaladDecorators;

import Meatball.Kofte;
import Meatball.SaladDecorator;

public class GevurdagiSalad extends SaladDecorator {
    Kofte kofte;

    public GevurdagiSalad(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 9.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Gevurdagi Salad";
    }

}
