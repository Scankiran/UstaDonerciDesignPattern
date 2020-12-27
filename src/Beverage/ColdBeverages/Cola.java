package Beverage.ColdBeverages;

import Beverage.ColdBeverage;

public class Cola extends ColdBeverage {
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Coco Cola 330 ML";
    }
}
