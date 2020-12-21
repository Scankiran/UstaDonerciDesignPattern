package Kofte.SosDecorators;

import Kofte.Kofte;
import Kofte.SosDecorator;

public class Barbeque extends SosDecorator {
    Kofte kofte;

    public Barbeque(Kofte kofte){
        this.kofte = kofte;
    }

    @Override
    public double cost() {
        return 0.95 + kofte.cost();
    }

    @Override
    public String getDescription() {
        return kofte.getDescription() + ", Barbeque";
    }
}
