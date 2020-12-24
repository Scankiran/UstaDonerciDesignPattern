package Commands;

public class DonerOrder implements Command{
    Cook cook;
    String order,size;
    public DonerOrder(Cook cook, String order){
        this.cook = cook;
        this.order= order;
    }

    @Override
    public void orderUp() {
        cook.donerType = order;
        cook.donerSize = size;
        cook.getOrder("doner");
    }
}
