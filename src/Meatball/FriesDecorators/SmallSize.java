package Meatball.FriesDecorators;

import Meatball.FriesDecorator;
import Meatball.Kofte;

public class SmallSize extends FriesDecorator {
    Kofte kofte;

    public SmallSize(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 4.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Small Size Fries";
    }
}
