package Meatball.SauceDecorators;

import Meatball.Meatball;
import Meatball.SauceDecorator;

public class Barbeque extends SauceDecorator {
    Meatball meatball;

    public Barbeque(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 0.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Barbeque";
    }
}
