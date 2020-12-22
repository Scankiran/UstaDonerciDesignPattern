package Doner.TypeDecorators;

import Doner.TypeDecorator;
import KidMenu.KidMenu;

public class Roll extends TypeDecorator {
    KidMenu kidMenu;

    public Roll(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return kidMenu.cost() * 1.5;
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Roll Type ";
    }
}
