package Meatball.AppetizerDecorators;

import Meatball.AppeziterDecorator;
import Meatball.Kofte;

public class Pickle extends AppeziterDecorator {
    Kofte kofte;

    public Pickle(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 0.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Pickle";
    }
}
