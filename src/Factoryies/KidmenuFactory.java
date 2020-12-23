package Factoryies;

import KidMenu.*;

public class KidmenuFactory {
    public KidMenu makeKidMenu(String kidmenuType) {
        switch (kidmenuType){
            case "Meat":
                return new MeatSandwich();
            case "Chicken":
                return new ChickenSandwich();
            case "Meatball":
                return new Meatball();
            default:
                return null;
        }
    }
}
