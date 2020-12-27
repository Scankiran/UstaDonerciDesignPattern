package Factoryies;

import Doner.*;
import Doner.Meat;

public class DonerFactory {
    public Doner makeDoner(String donerType) {
        switch (donerType){
            case "meat":
                return new Meat();
            case "chicken":
                return new Chicken();
            default:
                return null;
        }
    }
}
