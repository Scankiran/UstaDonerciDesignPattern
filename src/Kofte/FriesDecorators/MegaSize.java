package Kofte.FriesDecorators;

import Kofte.FriesDecorator;
import Kofte.Kofte;

public class MegaSize extends FriesDecorator {
    Kofte kofte;

    public MegaSize(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 7.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Mega Size Fries";
    }
}
