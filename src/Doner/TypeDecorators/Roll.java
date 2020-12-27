package Doner.TypeDecorators;

import Doner.Doner;
import Doner.TypeDecorator;
import KidMenu.KidMenu;

public class Roll extends TypeDecorator {
    Doner doner;

    public Roll(Doner doner) {
        this.doner = doner;
    }

    @Override
    public double cost() {
        return doner.cost() * 1.5;
    }

    @Override
    public String getDescription() {
        return doner.getDescription() + ", Roll Type ";
    }
}
