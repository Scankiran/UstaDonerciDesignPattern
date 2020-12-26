package Factoryies;

import Beverage.Beverage;
import Beverage.ColdBeverages.*;

public class ColdBeverageFactory {
    public Beverage makeBeverage(String beverageType) {
        switch (beverageType){
            case "ayran":
                return new Ayran();
            case "cola":
                return new Cola();
            case "fanta":
                return new Fanta();
            case "fuseTea":
                return new FuseTea();
            case "lemonade":
                return new Lemonade();
            case "sprite":
                return new Sprite();
            case "water":
                return new Water();
            case "orangeJuice":
                return new OrangeJuice();
            default:
                return null;
        }
    }
}
