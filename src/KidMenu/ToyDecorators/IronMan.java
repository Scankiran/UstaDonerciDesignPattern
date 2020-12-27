package KidMenu.ToyDecorators;

import KidMenu.KidMenu;
import KidMenu.ToyDecorator;

public class IronMan extends ToyDecorator {
    KidMenu kidMenu;

    public IronMan(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return 3.95 + kidMenu.cost();
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Iron Man Toy ";
    }
}
