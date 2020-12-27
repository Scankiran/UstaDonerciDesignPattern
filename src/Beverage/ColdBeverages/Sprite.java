package Beverage.ColdBeverages;

import Beverage.ColdBeverage;

public class Sprite extends ColdBeverage {
    @Override
    public double cost() {
        return 4.5;
    }

    @Override
    public String getDescription() {
        return "Sprite 330ML";
    }
}
