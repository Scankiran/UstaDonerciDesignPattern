package Factoryies;

import Beverage.Beverage;
import Beverage.ColdBeverages.*;

public class ColdBeverageFactory {
    public Beverage makeBeverage(String beverageType) {
        switch (beverageType){
            case "Ayran":
                return new Ayran();
            case "Cola":
                return new Cola();
            case "Fanta":
                return new Fanta();
            case "FuseTea":
                return new FuseTea();
            case "Lemonade":
                return new Lemonade();
            case "Sprite":
                return new Sprite();
            case "Water":
                return new Water();
            case "Orange Juice":
                return new OrangeJuice();
            default:
                return null;
        }
    }
}
