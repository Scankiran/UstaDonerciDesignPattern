package Meatball.SauceDecorators;

import Meatball.Meatball;
import Meatball.SauceDecorator;

public class UstaRanch extends SauceDecorator {
    Meatball meatball;

    public UstaRanch(Meatball meatball){
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
