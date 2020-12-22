package Factoryies;

import Beverage.Beverage;
import Beverage.HotBeverages.*;

public class HotBeverageFactory {
    public Beverage makeBeverage(String beverageType) {
        switch (beverageType){
            case "Black Cofee":
                return new BlackCoffee();
            case "Cappucino":
                return new Cappucino();
            case "Hot Chocolate":
                return new HotChocolate();
            case "Latte":
                return new Latte();
            case "Mocha":
                return new Mocha();
            case "Nescafe":
                return new Nescafe();
            case "Oralet":
                return new Oralet();
            case "Tea":
                return new Tea();
            default:
                return null;
        }
    }
}
