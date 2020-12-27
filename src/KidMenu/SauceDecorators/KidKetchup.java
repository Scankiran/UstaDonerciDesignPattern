package KidMenu.SauceDecorators;

import KidMenu.KidMenu;
import KidMenu.SauceDecorator;

public class KidKetchup extends SauceDecorator {
    KidMenu kidMenu;

    public KidKetchup(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return 0.35 + kidMenu.cost();
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Kid Ketchup ";
    }
}
