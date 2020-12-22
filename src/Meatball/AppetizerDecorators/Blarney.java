package Meatball.AppetizerDecorators;

import Meatball.AppeziterDecorator;
import Meatball.Kofte;

public class Blarney extends AppeziterDecorator {
    Kofte kofte;

    public Blarney(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 1.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Blarney";
    }
}
