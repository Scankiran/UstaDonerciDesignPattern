package Meatball.AppetizerDecorators;

import Meatball.AppeziterDecorator;
import Meatball.Meatball;

public class Grind extends AppeziterDecorator {
    Meatball meatball;

    public Grind(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 1.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", Grind";
    }
}
