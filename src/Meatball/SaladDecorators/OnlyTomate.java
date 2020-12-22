package Meatball.SaladDecorators;

import Meatball.Kofte;
import Meatball.SaladDecorator;

public class OnlyTomate extends SaladDecorator {
    Kofte kofte;

    public OnlyTomate(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 2.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Only Tomate Salad";
    }
}
