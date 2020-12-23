package Meatball.SaladDecorators;

import Meatball.Meatball;
import Meatball.SaladDecorator;

public class OnlyOnion extends SaladDecorator {
    Meatball meatball;

    public OnlyOnion(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 2.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Only Union Salad";
    }
}
