package Factoryies;

import Beverage.Beverage;
import Beverage.HotBeverages.*;

public class HotBeverageFactory implements BeverageFactory{
    @Override
    public Beverage makeBeverage(String beverageType) {
        switch (beverageType){
            case "black":
                return new BlackCoffee();
            case "cappuccino":
                return new Cappuccino();
            case "espresso":
                return new Espresso();
            case "hotchocolate":
                return new HotChocolate();
            case "latte":
                return new Latte();
            case "mocha":
                return new Mocha();
            case "nescafe":
                return new Nescafe();
            case "oralet":
                return new Oralet();
            case "tea":
                return new Tea();
            default:
                return null;
        }
    }
}
