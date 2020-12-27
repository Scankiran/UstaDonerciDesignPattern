package Beverage.ColdBeverages;

import Beverage.ColdBeverage;

public class OrangeJuice extends ColdBeverage {
    @Override
    public double cost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Orange Juice 250ML";
    }
}
