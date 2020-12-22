package KidMenu;

public abstract class KidMenu {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareDough(String type) {
        System.out.println("Preparing "+ type + " Kid Menu");
    }

    public void cookDough(String type) {
        System.out.println("Cooking " + type + " Kid Menu");
    }

    public void dishUp(String type) {
        System.out.println("Put " + type + " Kid Menu on the dish");
    }
}
