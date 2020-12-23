package Doner.TypeDecorators;

import Doner.Doner;
import Doner.TypeDecorator;
import KidMenu.KidMenu;

public class Sandwich extends TypeDecorator {
    Doner doner;

    public Sandwich(Doner doner) {
        this.doner = doner;
    }

    @Override
    public double cost() {
        return doner.cost() * 2.0;
    }

    @Override
    public String getDescription() {
        return doner.getDescription() + ", Sandwich Type ";
    }
}
