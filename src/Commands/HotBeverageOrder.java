package Commands;

public class HotBeverageOrder implements Command{
    Cook cook;
    String order;

    public HotBeverageOrder(Cook cook, String order){
        this.cook = cook;
        this.order= order;
    }


    @Override
    public void orderUp() {
        cook.hotBeverageType = order;
        cook.getOrder("hotBeverage");
    }
}
