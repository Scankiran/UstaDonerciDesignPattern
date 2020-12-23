package Meatball.AppetizerDecorators;

import Meatball.Meatball;
import Meatball.AppeziterDecorator;

public class PepperSalad extends AppeziterDecorator {
    Meatball meatball;

    public PepperSalad(Meatball meatball){
        this.meatball = meatball;
    }

    @Override
    public double cost() {
        return 1.95 + meatball.cost();
    }

    @Override
    public String getDescription() {
        return meatball.getDescription() + ", PepperSalad";
    }
}
