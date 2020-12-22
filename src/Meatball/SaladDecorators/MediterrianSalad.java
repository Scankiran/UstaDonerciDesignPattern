package Meatball.SaladDecorators;

import Meatball.Kofte;
import Meatball.SaladDecorator;

public class MediterrianSalad extends SaladDecorator {
    Kofte kofte;

    public MediterrianSalad(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 6.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Mediterrian Salad";
    }
}
