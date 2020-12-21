package Kofte.SosDecorators;

import Kofte.Kofte;
import Kofte.SosDecorator;

public class UstaRanch extends SosDecorator {
    Kofte kofte;

    public UstaRanch(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 0.50 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Ketchup";
    }

}
