package Meatball.FriesDecorators;

import Meatball.FriesDecorator;
import Meatball.Meatball;

public class BigSize extends FriesDecorator {
    Meatball meatball;

    public BigSize(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 6.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Big Size Fries";
    }
}
