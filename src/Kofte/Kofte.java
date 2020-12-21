package Kofte;

public abstract class Kofte {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareDough(String type) {
        System.out.println("Preparing "+ type + " kofte");
    }

    public void cookDough(String type) {
        System.out.println("Cooking " + type + " kofte");
    }

    public void dishUp(String type) {
        System.out.println("Put " + type + " köfte on the dish");
    }
}
