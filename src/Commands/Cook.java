package Commands;

import Beverage.Beverage;
import Doner.*;
import Doner.TypeDecorators.*;
import Factoryies.*;
import KidMenu.KidMenu;
import KidMenu.SauceDecorators.KidBarbeque;
import KidMenu.SauceDecorators.KidKetchup;
import KidMenu.SauceDecorators.KidMayonnaise;
import KidMenu.ToyDecorators.*;
import Meatball.AppetizerDecorators.Blarney;
import Meatball.AppetizerDecorators.Grind;
import Meatball.AppetizerDecorators.PepperSalad;
import Meatball.AppetizerDecorators.Pickle;
import Meatball.FriesDecorators.BigSize;
import Meatball.FriesDecorators.MegaSize;
import Meatball.FriesDecorators.MidSize;
import Meatball.FriesDecorators.SmallSize;
import Meatball.Meatball;
import Meatball.SaladDecorators.*;
import Meatball.SauceDecorators.*;
import java.util.ArrayList;

public class Cook {
    //TODO: Clienttan gönderirken listler devamlı değişek. Tüm decoratorları tutmaya gerek yok. O anki objenin decoratörlerini tutup decore edip bırakalım.
    String hotBeverageType, coldBeverageType, donerType, donerSize, meatballType, kidmenuType;
    String[] meatBallSaladList, meatBallAppzetierList, meatBallFriesList, meatballSauceList;
    String[] kidMenuToyList, kidMenuSauceList;

    ArrayList<Beverage> beverageList  = new ArrayList<>();
    ArrayList<Doner> donerList = new ArrayList<>();
    ArrayList<KidMenu> kidMenuList  = new ArrayList<>();
    ArrayList<Meatball> meatBallList  = new ArrayList<>();
    double totalCost = 0;

    public void getOrder(String factoryType){
        switch (factoryType){
            case "hotBeverage":
                System.out.println(hotBeverageType +"order reveived.");
                HotBeverageFactory hotBevFactory = new HotBeverageFactory();
                beverageList.add(hotBevFactory.makeBeverage(hotBeverageType));

            case "coldBeverage":
                System.out.println(coldBeverageType +"order reveived.");
                ColdBeverageFactory coldBevFactory = new ColdBeverageFactory();
                beverageList.add(coldBevFactory.makeBeverage(coldBeverageType));

            case "doner":
                System.out.println(donerType +"order reveived.");
                DonerFactory donerFactory = new DonerFactory();
                Doner orderedDoner = donerFactory.makeDoner(donerType);
                orderedDoner = decorate(orderedDoner,donerType);
                //TODO: Doner type'a bakılacak. 'Debugging'
                donerList.add(orderedDoner);

            case "meatball":
                System.out.println(meatballType +"order reveived.");
                MeetballFactory meatballFactory = new MeetballFactory();
                Meatball orderedMeatball = meatballFactory.makeMeatBall(meatballType);
                orderedMeatball = decorate(orderedMeatball,meatBallSaladList,meatBallAppzetierList,meatBallFriesList,meatballSauceList);
                //TODO: meeBall decore edilecek.
                meatBallList.add(orderedMeatball);

            case "kidmenu":
                System.out.println(kidmenuType +"order reveived.");
                KidmenuFactory kidFactory = new KidmenuFactory();
                KidMenu orderedKidMenu = kidFactory.makeKidMenu(kidmenuType);
                orderedKidMenu = decorate(orderedKidMenu,kidMenuToyList,kidMenuSauceList);
                //TODO: kidMenu decore edilecek.
                kidMenuList.add(orderedKidMenu);

        }


        //TODO: En son beverageleri prepare edip description ve costunu bastıracaksın.
        //TODO: En son donerleri prepare edip description ve costunu bastıracaksın.
        //TODO: En son köfteleri prepare edip description ve costunu bastıracaksın.
        //TODO: En son çocuk menülerini prepare edip description ve costunu bastıracaksın.

    }

    public void cookOrder() {
        for (Beverage beverage:beverageList
        ) {
            beverage.prepareBeverage();
            totalCost += beverage.cost();
        }

        for (Doner doner:donerList
        ) {
            doner.prepareDough(doner.getDescription());
            doner.cookDough(doner.getDescription());
            doner.dishUp(doner.getDescription());
            totalCost += doner.cost();
        }

        for (Meatball meatball:meatBallList
        ) {
            meatball.prepareDough(meatball.getDescription());
            meatball.cookDough(meatball.getDescription());
            meatball.dishUp(meatball.getDescription());
            totalCost = meatball.cost();
        }

        for (KidMenu kidmenu:kidMenuList
        ) {
            kidmenu.prepareDough(kidmenu.getDescription());
            kidmenu.cookDough(kidmenu.getDescription());
            kidmenu.dishUp(kidmenu.getDescription());
            totalCost += kidmenu.cost();
        }
    }

    public Doner decorate(Doner doner, String typeDecorator){
        switch (typeDecorator) {
            case "iskender":
                 doner = new Iskender(doner);
            case "roll":
                 doner = new Roll(doner);
            case "sandwich":
                 doner = new Sandwich(doner);
            case "kilogram":
                 doner = new Kilogram(doner);
            case "hamburger":
                 doner = new Hamburger(doner);
            default:

        }
        return doner;
    }

    public Meatball decorate(Meatball meatball, String[] meatBallSaladList,String[] meatBallAppzetierList, String[]meatBallFriesList, String[]meatballSauceList){
        for (int i = 0; i < meatBallSaladList.length; i++) {
            switch (meatBallSaladList[i].toLowerCase()) {
                case "coban":
                     meatball = new CobanSalad(meatball);
                case "gevurdagi":
                     meatball = new GevurdagiSalad(meatball);
                case "mediterrian":
                     meatball = new MediterrianSalad(meatball);
                case "onion":
                     meatball = new OnlyOnion(meatball);
                case "pepper":
                     meatball = new OnlyPepper(meatball);
                case "tomate":
                     meatball = new OnlyTomate(meatball);
                default:

            }
        }

        for (int i = 0; i < meatBallAppzetierList.length; i++) {
            switch (meatBallAppzetierList[i].toLowerCase()) {
                case "blarney":
                     meatball = new Blarney(meatball);
                case "grind":
                     meatball = new Grind(meatball);
                case "peppersalad":
                     meatball = new PepperSalad(meatball);
                case "pickle":
                     meatball = new Pickle(meatball);
                default:

            }
        }

        for (int i = 0; i < meatBallFriesList.length; i++) {
            switch (meatBallFriesList[i].toLowerCase()) {
                case "big":
                     meatball = new BigSize(meatball);
                case "mid":
                     meatball = new MidSize(meatball);
                case "small":
                     meatball = new SmallSize(meatball);
                case "mega":
                     meatball = new MegaSize(meatball);
                default:

            }
        }

        for (int i = 0; i < meatballSauceList.length; i++) {
            switch (meatballSauceList[i].toLowerCase()) {
                case "barbeque":
                     meatball = new Barbeque(meatball);
                case "hotsauce":
                     meatball = new HotSauce(meatball);
                case "ketchup":
                     meatball = new Ketchup(meatball);
                case "mayonnaise":
                     meatball = new Mayonnaise(meatball);
                case "ustaranch":
                     meatball = new UstaRanch(meatball);
                default:

            }
        }
        return meatball;
    }

    public KidMenu decorate(KidMenu kidMenu, String[] kidMenuToyList,String[] kidMenuSauceList) {
        for (int i = 0; i < kidMenuToyList.length; i++) {
            switch (kidMenuToyList[i].toLowerCase()) {
                case "barbie":
                     kidMenu = new Barbie(kidMenu);
                case "batman":
                     kidMenu = new Batman(kidMenu);
                case "hotwhells":
                     kidMenu = new HotWhells(kidMenu);
                case "ironman":
                     kidMenu = new IronMan(kidMenu);
                case "spiderman":
                     kidMenu = new SpiderMan(kidMenu);
                case "spongebob":
                     kidMenu = new SpongeBob(kidMenu);
                case "winxclub":
                     kidMenu = new WinxClubBaby(kidMenu);
                default:

            }
        }

        for (int i = 0; i < kidMenuSauceList.length; i++) {
            switch (kidMenuSauceList[i].toLowerCase()) {
                case "barbeque":
                     kidMenu = new KidBarbeque(kidMenu);
                case "ketchup":
                     kidMenu = new KidKetchup(kidMenu);
                case "mayonnaise":
                     kidMenu = new KidMayonnaise(kidMenu);
                default:

            }
        }
        return kidMenu;
    }
}
