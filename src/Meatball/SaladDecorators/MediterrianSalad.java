package Meatball.SaladDecorators;

import Meatball.Meatball;
import Meatball.SaladDecorator;

public class MediterrianSalad extends SaladDecorator {
    Meatball meatball;

    public MediterrianSalad(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 6.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Mediterrian Salad";
    }
}
