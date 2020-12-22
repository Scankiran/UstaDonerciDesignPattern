package KidMenu.SauceDecorators;

import KidMenu.KidMenu;
import KidMenu.SauceDecorator;

public class Mayonnaise extends SauceDecorator {
    KidMenu kidMenu;

    public Mayonnaise(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return 0.35 + kidMenu.cost();
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Kid Mayonnaise ";
    }
}
