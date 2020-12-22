package Meatball.SauceDecorators;

import Meatball.Kofte;
import Meatball.SauceDecorator;

public class Ketchup extends SauceDecorator {
    Kofte kofte;

    public Ketchup(Kofte kofte){
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
