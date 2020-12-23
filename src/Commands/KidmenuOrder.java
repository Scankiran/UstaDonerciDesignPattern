package Commands;

public class KidmenuOrder implements Command{
    Cook cook;
    String order;
    String[] toys, sauce;
    public KidMenu(Cook cook, String order){
        this.cook = cook;
        this.order= order;

    }

    @Override
    public void orderUp() {
        cook.beverageType = order;
        cook.getOrder("Beverage");
    }
}
