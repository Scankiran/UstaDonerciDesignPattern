package Commands;

public class MeatballOrder implements Command{
    Cook cook;
    String order;
    String[] sauceList, saladList, appzetierList, friesList;
    public MeatballOrder(Cook cook, String order){
        this.cook = cook;
        this.order= order;
    }

    @Override
    public void orderUp() {
        cook.beverageType = order;
        cook.getOrder("Beverage");
    }
}
