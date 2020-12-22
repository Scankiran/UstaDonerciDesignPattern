package Doner.TypeDecorators;

import Doner.TypeDecorator;
import KidMenu.KidMenu;

public class Sandwich extends TypeDecorator {
    KidMenu kidMenu;

    public Sandwich(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return kidMenu.cost() * 2.0;
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Sandwich Type ";
    }
}
