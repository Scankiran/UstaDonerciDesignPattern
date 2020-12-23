package Doner.TypeDecorators;

import Doner.Doner;
import Doner.TypeDecorator;
import KidMenu.KidMenu;

public class Kilogram extends TypeDecorator {
    Doner doner;

    public Kilogram(Doner doner) {
        this.doner = doner;
    }

    @Override
    public double cost() {
        return doner.cost() * 8.0;
    }

    @Override
    public String getDescription() {
        return doner.getDescription() + ", Kilogram Type ";
    }

}
