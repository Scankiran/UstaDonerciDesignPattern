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
                break;

            case "coldBeverage":
                System.out.println(coldBeverageType +"order reveived.");
                ColdBeverageFactory coldBevFactory = new ColdBeverageFactory();
                beverageList.add(coldBevFactory.makeBeverage(coldBeverageType));
                break;

            case "doner":
                System.out.println(donerType +"order reveived.");
                DonerFactory donerFactory = new DonerFactory();
                Doner orderedDoner = donerFactory.makeDoner(donerType);
                orderedDoner = decorate(orderedDoner,donerSize);
                donerList.add(orderedDoner);
                break;

            case "meatball":
                System.out.println(meatballType +"order reveived.");
                MeetballFactory meatballFactory = new MeetballFactory();
                Meatball orderedMeatball = meatballFactory.makeMeatBall(meatballType);
                orderedMeatball = decorate(orderedMeatball,meatBallSaladList,meatBallAppzetierList,meatBallFriesList,meatballSauceList);
                meatBallList.add(orderedMeatball);
                break;

            case "kidmenu":
                System.out.println(kidmenuType +"order reveived.");
                KidmenuFactory kidFactory = new KidmenuFactory();
                KidMenu orderedKidMenu = kidFactory.makeKidMenu(kidmenuType);
                orderedKidMenu = decorate(orderedKidMenu,kidMenuToyList,kidMenuSauceList);
                kidMenuList.add(orderedKidMenu);
                break;

        }

    }

    public void cookOrder() {
        for (Beverage beverage:beverageList
        ) {
            beverage.prepareBeverage();
            totalCost += beverage.cost();
            System.out.println(beverage.getDescription() + "cost is --> "+ beverage.cost());
        }

        for (Doner doner:donerList
        ) {
            doner.prepareDough(doner.getDescription());
            doner.cookDough(doner.getDescription());
            doner.dishUp(doner.getDescription());
            System.out.println(doner.getDescription() + "cost is --> "+ doner.cost());
            totalCost += doner.cost();
        }

        for (Meatball meatball:meatBallList
        ) {
            meatball.prepareDough(meatball.getDescription());
            meatball.cookDough(meatball.getDescription());
            meatball.dishUp(meatball.getDescription());
            System.out.println(meatball.getDescription() + "cost is --> "+ meatball.cost());
            totalCost = meatball.cost();
        }

        for (KidMenu kidmenu:kidMenuList
        ) {
            kidmenu.prepareDough(kidmenu.getDescription());
            kidmenu.cookDough(kidmenu.getDescription());
            kidmenu.dishUp(kidmenu.getDescription());
            System.out.println(kidmenu.getDescription() + "cost is --> "+ kidmenu.cost());
            totalCost += kidmenu.cost();
        }

        System.err.println("Total cost is " + totalCost);
    }

    public Doner decorate(Doner doner, String typeDecorator){
        switch (typeDecorator) {
            case "iskender":
                 doner = new Iskender(doner);
                 break;
            case "roll":
                 doner = new Roll(doner);
                 break;
            case "sandwich":
                 doner = new Sandwich(doner);
                 break;
            case "kilogram":
                 doner = new Kilogram(doner);
                 break;
            case "hamburger":
                 doner = new Hamburger(doner);
                 break;
            default:
                break;
        }
        return doner;
    }

    public Meatball decorate(Meatball meatball, String[] meatBallSaladList,String[] meatBallAppzetierList, String[]meatBallFriesList, String[]meatballSauceList){
        for (int i = 0; i < meatBallSaladList.length; i++) {
            switch (meatBallSaladList[i].toLowerCase()) {
                case "coban":
                     meatball = new CobanSalad(meatball);
                     break;
                case "gevurdagi":
                     meatball = new GevurdagiSalad(meatball);
                     break;
                case "mediterrian":
                     meatball = new MediterrianSalad(meatball);
                     break;
                case "onion":
                     meatball = new OnlyOnion(meatball);
                case "pepper":
                     meatball = new OnlyPepper(meatball);
                     break;
                case "tomate":
                     meatball = new OnlyTomate(meatball);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < meatBallAppzetierList.length; i++) {
            switch (meatBallAppzetierList[i].toLowerCase()) {
                case "blarney":
                     meatball = new Blarney(meatball);
                     break;
                case "grind":
                     meatball = new Grind(meatball);
                     break;
                case "peppersalad":
                     meatball = new PepperSalad(meatball);
                     break;
                case "pickle":
                     meatball = new Pickle(meatball);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < meatBallFriesList.length; i++) {
            switch (meatBallFriesList[i].toLowerCase()) {
                case "big":
                     meatball = new BigSize(meatball);
                     break;
                case "mid":
                     meatball = new MidSize(meatball);
                     break;
                case "small":
                     meatball = new SmallSize(meatball);
                     break;
                case "mega":
                     meatball = new MegaSize(meatball);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < meatballSauceList.length; i++) {
            switch (meatballSauceList[i].toLowerCase()) {
                case "barbeque":
                     meatball = new Barbeque(meatball);
                     break;
                case "hotsauce":
                     meatball = new HotSauce(meatball);
                     break;
                case "ketchup":
                     meatball = new Ketchup(meatball);
                     break;
                case "mayonnaise":
                     meatball = new Mayonnaise(meatball);
                     break;
                case "ustaranch":
                     meatball = new UstaRanch(meatball);
                     break;
                default:
                    break;

            }
        }
        return meatball;
    }

    public KidMenu decorate(KidMenu kidMenu, String[] kidMenuToyList,String[] kidMenuSauceList) {
        for (int i = 0; i < kidMenuToyList.length; i++) {
            switch (kidMenuToyList[i].toLowerCase()) {
                case "barbie":
                     kidMenu = new Barbie(kidMenu);
                     break;
                case "batman":
                     kidMenu = new Batman(kidMenu);
                     break;
                case "hotwhells":
                     kidMenu = new HotWhells(kidMenu);
                     break;
                case "ironman":
                     kidMenu = new IronMan(kidMenu);
                     break;
                case "spiderman":
                     kidMenu = new SpiderMan(kidMenu);
                     break;
                case "spongebob":
                     kidMenu = new SpongeBob(kidMenu);
                     break;
                case "winxclub":
                     kidMenu = new WinxClubBaby(kidMenu);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < kidMenuSauceList.length; i++) {
            switch (kidMenuSauceList[i].toLowerCase()) {
                case "barbeque":
                     kidMenu = new KidBarbeque(kidMenu);
                     break;
                case "ketchup":
                     kidMenu = new KidKetchup(kidMenu);
                     break;
                case "mayonnaise":
                     kidMenu = new KidMayonnaise(kidMenu);
                     break;
                default:
                    break;

            }
        }
        return kidMenu;
    }
}
