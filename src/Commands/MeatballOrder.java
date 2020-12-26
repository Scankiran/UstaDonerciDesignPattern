package Commands;

public class MeatballOrder implements Command{
    Cook cook;
    String order;
    String[] meatBallSaladList, meatBallAppzetierList, meatBallFriesList, meatballSauceList;

    public MeatballOrder(Cook cook, String order,String[] meatBallSaladList,String[] meatBallAppzetierList,String[] meatBallFriesList,String[] meatballSauceList ){
        this.cook = cook;
        this.order= order;
        this.meatBallSaladList = meatBallSaladList;
        this.meatBallAppzetierList = meatBallAppzetierList;
        this.meatBallFriesList = meatBallFriesList;
        this.meatballSauceList = meatballSauceList;
    }

    @Override
    public void orderUp() {
        cook.meatballType = order;
        cook.meatBallSaladList = meatBallSaladList;
        cook.meatBallAppzetierList = meatBallAppzetierList;
        cook.meatBallFriesList = meatBallFriesList;
        cook.meatballSauceList = meatballSauceList;
        cook.getOrder("meatball");
    }
}
