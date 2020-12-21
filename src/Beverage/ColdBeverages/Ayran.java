package Beverage.ColdBeverages;
import Beverage.ColdBeverage;

public class Ayran extends ColdBeverage {
    @Override
    public double cost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Sütaş Ayran";
    }
}
