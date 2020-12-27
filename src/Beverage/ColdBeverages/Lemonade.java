package Beverage.ColdBeverages;

import Beverage.ColdBeverage;

public class Lemonade extends ColdBeverage {
    @Override
    public double cost() {
        return 3.5;
    }

    @Override
    public String getDescription() {
        return "Lemonade 500 ML";
    }
}
