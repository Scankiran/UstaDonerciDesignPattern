package Meatball;

public abstract class Meatball {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareDough(String type) {
        System.out.println("Preparing "+ type + " meatball");
    }

    public void cookDough(String type) {
        System.out.println("Cooking " + type + " meatball");
    }

    public void dishUp(String type) {
        System.out.println("Put " + type + " meatball on the dish");
    }
}
