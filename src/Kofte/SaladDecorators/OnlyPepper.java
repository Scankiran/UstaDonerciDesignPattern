package Kofte.SaladDecorators;

import Kofte.Kofte;
import Kofte.SaladDecorator;

public class OnlyPepper extends SaladDecorator {
    Kofte kofte;

    public OnlyPepper(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 2.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Only Pepper Salad";
    }
}
