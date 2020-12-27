package KidMenu.ToyDecorators;

import KidMenu.KidMenu;
import KidMenu.ToyDecorator;

public class SpongeBob extends ToyDecorator {
    KidMenu kidMenu;

    public SpongeBob(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return 3.95 + kidMenu.cost();
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Sponge Bob Toy ";
    }
}
