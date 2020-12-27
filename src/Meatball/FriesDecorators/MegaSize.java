package Meatball.FriesDecorators;

import Meatball.FriesDecorator;
import Meatball.Meatball;

public class MegaSize extends FriesDecorator {
    Meatball meatball;

    public MegaSize(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 7.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Mega Size Fries";
    }
}
