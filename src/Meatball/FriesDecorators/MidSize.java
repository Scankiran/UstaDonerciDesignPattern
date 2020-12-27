package Meatball.FriesDecorators;

import Meatball.FriesDecorator;
import Meatball.Meatball;

public class MidSize extends FriesDecorator {
    Meatball meatball;

    public MidSize(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 5.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Mid Size Fries";
    }
}
