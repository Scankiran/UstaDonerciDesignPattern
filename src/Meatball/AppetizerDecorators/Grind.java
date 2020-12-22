package Meatball.AppetizerDecorators;

import Meatball.AppeziterDecorator;
import Meatball.Kofte;

public class Grind extends AppeziterDecorator {
    Kofte kofte;

    public Grind(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 1.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Grind";
    }
}
