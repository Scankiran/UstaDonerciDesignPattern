import Beverage.Beverage;
import Doner.*;
import Doner.TypeDecorators.*;
import Factoryies.*;
import KidMenu.KidMenu;
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

    ArrayList<Beverage> beverageList;
    ArrayList<Doner> donerList;
    ArrayList<KidMenu> kidMenuList;
    ArrayList<Meatball> meatBallList;

    public void getOrder(String factoryType){
        switch (factoryType.toLowerCase()){
            case "hot beverage":
                System.out.println(hotBeverageType +"order reveived.");
                HotBeverageFactory hotBevFactory = new HotBeverageFactory();
                beverageList.add(hotBevFactory.makeBeverage(hotBeverageType));

            case "cold beverage":
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

    public Doner decorate(Doner doner, String typeDecorator){
        switch (typeDecorator) {
            case "iskender":
                 new Iskender(doner);
            case "roll":
                 new Roll(doner);
            case "sandwich":
                 new Sandwich(doner);
            case "kilogram":
                 new Kilogram(doner);
            case "hamburger":
                 new Hamburger(doner);
            default:

        }
        return doner;
    }


    public Meatball decorate(Meatball meatball, String[] meatBallSaladList,String[] meatBallAppzetierList, String[]meatBallFriesList, String[]meatballSauceList){
        for (int i = 0; i < meatBallSaladList.length; i++) {
            switch (meatBallSaladList[i].toLowerCase()) {
                case "coban":
                     new CobanSalad(meatball);
                case "gevurdagi":
                     new GevurdagiSalad(meatball);
                case "mediterrian":
                     new MediterrianSalad(meatball);
                case "union":
                     new OnlyOnion(meatball);
                case "pepper":
                     new OnlyPepper(meatball);
                case "tomate":
                     new OnlyTomate(meatball);
                default:

            }
        }

        for (int i = 0; i < meatBallAppzetierList.length; i++) {
            switch (meatBallAppzetierList[i].toLowerCase()) {
                case "blarney":
                     new Blarney(meatball);
                case "grind":
                     new Grind(meatball);
                case "peppersalad":
                     new PepperSalad(meatball);
                case "pickle":
                     new Pickle(meatball);
                default:

            }
        }

        for (int i = 0; i < meatBallFriesList.length; i++) {
            switch (meatBallFriesList[i].toLowerCase()) {
                case "big":
                     new BigSize(meatball);
                case "mid":
                     new MidSize(meatball);
                case "small":
                     new SmallSize(meatball);
                case "mega":
                     new MegaSize(meatball);
                default:

            }
        }

        for (int i = 0; i < meatballSauceList.length; i++) {
            switch (meatballSauceList[i].toLowerCase()) {
                case "barbeque":
                     new Barbeque(meatball);
                case "hotsauce":
                     new HotSauce(meatball);
                case "ketchup":
                     new Ketchup(meatball);
                case "mayonnaise":
                     new Mayonnaise(meatball);
                case "ustaranch":
                     new UstaRanch(meatball);
                default:

            }
        }
        return meatball;
    }

    public KidMenu decorate(KidMenu kidMenu, String[] kidMenuToyList,String[] kidMenuSauceList) {
        for (int i = 0; i < kidMenuToyList.length; i++) {
            switch (kidMenuToyList[i].toLowerCase()) {
                case "barbie":
                     new Barbie(kidMenu);
                case "batman":
                     new Batman(kidMenu);
                case "hotwhells":
                     new HotWhells(kidMenu);
                case "ironman":
                     new IronMan(kidMenu);
                case "spiderman":
                     new SpiderMan(kidMenu);
                case "spongebob":
                     new SpongeBob(kidMenu);
                case "winxclub":
                     new WinxClubBaby(kidMenu);
                default:

            }
        }

        for (int i = 0; i < kidMenuSauceList.length; i++) {
            switch (kidMenuSauceList[i].toLowerCase()) {
                case "barbeque":
                     new KidMenu.SauceDecorators.Barbeque(kidMenu);
                case "ketchup":
                     new KidMenu.SauceDecorators.Ketchup(kidMenu);
                case "mayonnaise":
                     new KidMenu.SauceDecorators.Mayonnaise(kidMenu);
                default:

            }
        }
        return kidMenu;
    }
}
