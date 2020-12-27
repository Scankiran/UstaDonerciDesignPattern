package Meatball.AppetizerDecorators;

import Meatball.AppeziterDecorator;
import Meatball.Meatball;

public class Pickle extends AppeziterDecorator {
    Meatball meatball;

    public Pickle(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 0.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Pickle";
    }
}
