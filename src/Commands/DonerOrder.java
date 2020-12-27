package Commands;

public class DonerOrder implements Command{
    Cook cook;
    String order,size;
    public DonerOrder(Cook cook, String order,String size){
        this.cook = cook;
        this.order = order;
        this.size = size;
    }

    @Override
    public void orderUp() {
        cook.donerType = order;
        cook.donerSize = size;
        cook.getOrder("doner");
    }
}
