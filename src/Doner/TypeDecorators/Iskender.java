package Doner.TypeDecorators;

import Doner.Chicken;
import Doner.TypeDecorator;
import KidMenu.KidMenu;

public class Iskender extends TypeDecorator {
    KidMenu kidMenu;

    public Iskender(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
            return kidMenu.cost() * 3.5;
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Iskender Type ";
    }

}
