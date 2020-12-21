package Kofte.FriesDecorators;

import Kofte.FriesDecorator;
import Kofte.Kofte;

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
