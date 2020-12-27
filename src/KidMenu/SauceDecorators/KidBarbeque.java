package KidMenu.SauceDecorators;

import KidMenu.KidMenu;
import KidMenu.SauceDecorator;

public class KidBarbeque extends SauceDecorator {
    KidMenu kidMenu;

    public KidBarbeque(KidMenu kidMenu){
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return 0.45 + kidMenu.cost();
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Kid Barbeque Sauce ";
    }
}
