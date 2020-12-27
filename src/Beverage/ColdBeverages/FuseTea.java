package Beverage.ColdBeverages;

import Beverage.ColdBeverage;

public class FuseTea extends ColdBeverage {
    @Override
    public double cost() {
        return 4.5;
    }

    @Override
    public String getDescription() {
        return "Lipton Ice Tea 500 ML";
    }
}
