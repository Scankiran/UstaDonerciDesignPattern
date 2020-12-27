package Meatball.SauceDecorators;

import Meatball.Meatball;
import Meatball.SauceDecorator;

public class Ketchup extends SauceDecorator {
    Meatball meatball;

    public Ketchup(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 0.50 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Ketchup";
    }
}
