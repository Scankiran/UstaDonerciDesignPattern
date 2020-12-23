package Factoryies;

import Doner.*;
import Doner.Meat;

public class DonerFactory {
    public Doner makeDoner(String donerType) {
        switch (donerType){
            case "Meat":
                return new Meat();
            case "Chicken":
                return new Chicken();
            default:
                return null;
        }
    }
}
