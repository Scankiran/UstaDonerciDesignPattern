package Commands;

public class DonerOrder implements Command{
    Cook cook;
    String order;
    String type;
    String size;
    public Doner(Cook cook, String order){
        this.cook = cook;
        this.order= order;
    }

    @Override
    public void orderUp() {
        cook.beverageType = order;
        cook.getOrder("Beverage");
    }
}
