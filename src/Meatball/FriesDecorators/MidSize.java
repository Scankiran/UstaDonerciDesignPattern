package Meatball.FriesDecorators;

import Meatball.FriesDecorator;
import Meatball.Kofte;

public class MidSize extends FriesDecorator {
    Kofte kofte;

    public MidSize(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 5.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Mid Size Fries";
    }
}
