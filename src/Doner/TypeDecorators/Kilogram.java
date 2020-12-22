package Doner.TypeDecorators;

import Doner.TypeDecorator;
import KidMenu.KidMenu;

public class Kilogram extends TypeDecorator {
    KidMenu kidMenu;

    public Kilogram(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return kidMenu.cost() * 8.0;
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Kilogram Type ";
    }

}
