package Commands;

public class ColdBeverageOrder implements Command{
    Cook cook;
    String order;
    public ColdBeverageOrder(Cook cook, String order){
        this.cook = cook;
        this.order= order;
    }

    @Override
    public void orderUp() {
        cook.coldBeverageType = order;
        cook.getOrder("coldBeverage");
    }
}
