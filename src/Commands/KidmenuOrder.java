package Commands;


public class KidmenuOrder implements Command{
    Cook cook;
    String order;
    String[] kidMenuToyList, kidMenuSauceList;
    public KidmenuOrder(Cook cook, String order, String[] kidMenuSauceList, String[] kidMenuToyList){
        this.cook = cook;
        this.order= order;
        this.kidMenuSauceList = kidMenuSauceList;
        this.kidMenuToyList = kidMenuToyList;
    }

    @Override
    public void orderUp() {
        cook.kidmenuType = order;
        cook.kidMenuSauceList = kidMenuSauceList;
        cook.kidMenuToyList = kidMenuToyList;
        cook.getOrder("kidmenu");
    }

}
