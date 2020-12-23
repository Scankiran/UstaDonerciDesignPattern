package Meatball.SaladDecorators;

import Meatball.Meatball;
import Meatball.SaladDecorator;

public class GevurdagiSalad extends SaladDecorator {
    Meatball meatball;

    public GevurdagiSalad(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 9.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Gevurdagi Salad";
    }

}
