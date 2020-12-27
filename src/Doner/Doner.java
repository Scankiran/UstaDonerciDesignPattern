package Doner;

public abstract class Doner {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareDough(String type) {
        System.out.println("Preparing "+ type + " Doner ");
    }

    public void cookDough(String type) {
        System.out.println("Cooking " + type + " Doner ");
    }

    public void dishUp(String type) {
        System.out.println("Put " + type + " Doner  on the dish");
    }
}
