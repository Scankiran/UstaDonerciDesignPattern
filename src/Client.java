import Commands.Cook;
import Commands.DonerOrder;
import Commands.Waitress;

import java.util.Scanner;

public class Client {
    static Cook cook;
    static Waitress waitress;
    public static void main(String[] args) {
        cook = new Cook();
        waitress = new Waitress();

        Scanner scanner = new Scanner(System.in);
        System.out.println("********* Welcome to The Usta Donerci *********");
        while(true) {
            System.out.println("What do you want to order?");
            System.out.println("1 --> Doner");
            System.out.println("2 --> Meatball");
            System.out.println("3 --> Kid Menu");
            System.out.println("4 --> Beverage");
            System.out.println("0 --> I have finished ordering. Prepare please.");

            int orderType = scanner.nextInt();

            switch (orderType){
                case 1:
                    donerMenu(scanner);
            }
        }
    }


    private static void donerMenu(Scanner scanner){
        while(true) {
            System.out.println("Which type do you want?");
            System.out.println("1 --> Meat");
            System.out.println("2 --> Chicken");
            System.out.println(("0 --> I dont want to Doner. Back."));

            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    lastPartOfDoner("meat",scanner);
                case 2:
                    lastPartOfDoner("chicken",scanner);
                default:
                    continue;
            }
        }
    }

    private void meatballMenu(){

    }

    private void kidMenu(){

    }

    private void beverageMenu(){

    }

    private static void lastPartOfDoner(String order,Scanner scanner) {
        System.out.println("Which size do you want?");
        System.out.println("1 --> Iskender");
        System.out.println("2 --> Roll");
        System.out.println("3 --> Hamburger");
        System.out.println("4 --> Sandwich");
        System.out.println("5 --> Kilogram");
        System.out.println("0 --> I have finished ordering. Prepare please.");

        int size = scanner.nextInt();
        switch (size){
            case 1:
                DonerOrder donerIskender = new DonerOrder(cook,order,"iskender");
                waitress.takeOrder(donerIskender);
            case 2:
                DonerOrder donerRoll = new DonerOrder(cook,order,"roll");
                waitress.takeOrder(donerRoll);
            case 3:
                DonerOrder donerHamburger = new DonerOrder(cook,order,"hamburger");
                waitress.takeOrder(donerHamburger);
            case 4:
                DonerOrder donerSandwich = new DonerOrder(cook,order,"sandwich");
                waitress.takeOrder(donerSandwich);
            case 5:
                DonerOrder donerKilogram = new DonerOrder(cook,order,"kilogram");
                waitress.takeOrder(donerKilogram);
            case 0:
                break;
        }
    }
}
