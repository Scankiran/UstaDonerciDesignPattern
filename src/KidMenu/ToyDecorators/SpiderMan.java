package KidMenu.ToyDecorators;

import KidMenu.KidMenu;
import KidMenu.ToyDecorator;

public class SpiderMan extends ToyDecorator {
    KidMenu kidMenu;

    public SpiderMan(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return 3.95 + kidMenu.cost();
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Spider Man Toy ";
    }
}
