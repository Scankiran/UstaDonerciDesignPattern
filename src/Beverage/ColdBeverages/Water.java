package Beverage.ColdBeverages;

import Beverage.ColdBeverage;

public class Water extends ColdBeverage {@Override
    public double cost() {
    return 1.5;
}

    @Override
    public String getDescription() {
        return "Sırma Su 0.5L";
    }

}
