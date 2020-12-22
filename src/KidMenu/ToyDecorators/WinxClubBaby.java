package KidMenu.ToyDecorators;

import KidMenu.KidMenu;
import KidMenu.ToyDecorator;

public class WinxClubBaby extends ToyDecorator {
    KidMenu kidMenu;

    public WinxClubBaby(KidMenu kidMenu) {
        this.kidMenu = kidMenu;
    }

    @Override
    public double cost() {
        return 3.95 + kidMenu.cost();
    }

    @Override
    public String getDescription() {
        return kidMenu.getDescription() + ", Winx Club Baby Toy ";
    }
}
