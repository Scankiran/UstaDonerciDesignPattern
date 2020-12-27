package Doner.TypeDecorators;

import Doner.Doner;
import Doner.TypeDecorator;

public class Iskender extends TypeDecorator {
    Doner doner;

    public Iskender(Doner doner) {
        this.doner = doner;
    }

    @Override
    public double cost() {
            return doner.cost() * 3.5;
    }

    @Override
    public String getDescription() {
        return doner.getDescription() + ", Iskender Type ";
    }

}
