package Meatball.FriesDecorators;

import Meatball.FriesDecorator;
import Meatball.Meatball;

public class SmallSize extends FriesDecorator {
    Meatball meatball;

    public SmallSize(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 4.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Small Size Fries";
    }
}
