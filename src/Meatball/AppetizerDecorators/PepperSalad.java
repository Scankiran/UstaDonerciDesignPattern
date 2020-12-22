package Meatball.AppetizerDecorators;

import Meatball.Kofte;
import Meatball.AppeziterDecorator;

public class PepperSalad extends AppeziterDecorator {
    Kofte kofte;

    public PepperSalad(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 1.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", PepperSalad";
    }
}
