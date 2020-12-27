package Meatball.SauceDecorators;

import Meatball.Meatball;
import Meatball.SauceDecorator;

public class Mayonnaise extends SauceDecorator {
    Meatball meatball;

    public Mayonnaise(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 0.50 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Mayonnise";
    }
}
