package Meatball.SaladDecorators;

import Meatball.Kofte;
import Meatball.SaladDecorator;

public class OnlyOnion extends SaladDecorator {
    Kofte kofte;

    public OnlyOnion(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 2.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Only Union Salad";
    }
}
