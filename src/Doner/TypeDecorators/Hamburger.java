package Doner.TypeDecorators;

import Doner.Doner;
import Doner.TypeDecorator;

public class Hamburger extends TypeDecorator {
    Doner doner;

    public Hamburger(Doner doner) {
        this.doner = doner;
    }

    @Override
    public double cost() {
        return doner.cost() * 2.0;
    }

    @Override
    public String getDescription() {
        return doner.getDescription() + ", Hamburger Type ";
    }
}
