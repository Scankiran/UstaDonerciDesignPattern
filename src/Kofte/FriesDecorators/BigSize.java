package Kofte.FriesDecorators;

import Kofte.FriesDecorator;
import Kofte.Kofte;

public class BigSize extends FriesDecorator {
    Kofte kofte;

    public BigSize(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 6.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Big Size Fries";
    }
}
