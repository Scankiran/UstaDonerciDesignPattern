package KidMenu.ToyDecorators;

import KidMenu.KidMenu;
import KidMenu.ToyDecorator;

public class Batman extends ToyDecorator {
    KidMenu kidMenu;

    public Batman(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return 2.95 + kidMenu.cost();
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Batman Toy ";
    }
}
