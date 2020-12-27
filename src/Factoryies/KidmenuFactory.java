package Factoryies;

import KidMenu.*;

public class KidmenuFactory {
    public KidMenu makeKidMenu(String kidmenuType) {
        switch (kidmenuType){
            case "meat":
                return new MeatSandwich();
            case "chicken":
                return new ChickenSandwich();
            case "meatball":
                return new Meatball();
            default:
                return null;
        }
    }
}
