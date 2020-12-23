package Factoryies;

import Meatball.*;

public class MeetballFactory {
    public Meatball makeMeatBall(String meatballType) {
        switch (meatballType){
            case "Normal":
                return new ServingSize();
            case "Five Meatball":
                return new WithFive();
            case "With Pita":
                return new WithPita();
            case "Kilogram":
                return new KilogramsSize();
            case "Sandwich":
                return new Sandwich();
            default:
                return null;
        }
    }
}
