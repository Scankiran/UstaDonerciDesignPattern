package Beverage.ColdBeverages;

import Beverage.ColdBeverage;

public class Fanta extends ColdBeverage {
    @Override
    public double cost() {
        return 4.5;
    }

    @Override
    public String getDescription() {
        return "Fanta 330ML";
    }
}
