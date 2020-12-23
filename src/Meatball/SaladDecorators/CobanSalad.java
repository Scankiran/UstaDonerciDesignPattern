package Meatball.SaladDecorators;

import Meatball.Meatball;
import Meatball.SaladDecorator;

public class CobanSalad extends SaladDecorator {
    Meatball meatball;

    public CobanSalad(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 8.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Coban Salad";
    }
}
