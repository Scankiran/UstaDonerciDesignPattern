package Meatball.SauceDecorators;

import Meatball.Kofte;
import Meatball.SauceDecorator;

public class HotSauce extends SauceDecorator {
    Kofte kofte;

    public HotSauce(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 0.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Hot Sauce";
    }
}
