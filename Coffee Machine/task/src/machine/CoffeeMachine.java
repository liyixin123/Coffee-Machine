package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static final Scanner scanner = new Scanner(System.in);
    static private int water = 400;
    static private int milk = 540;
    static private int coffeeBeans = 120;
    static private int disposableCups = 9;
    static private int money = 550;

    static private void showState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }

    static private void inputYourOpt() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String opt = scanner.next();
        while (!opt.equals("exit")) {
            selectOptionMode(opt);
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            opt = scanner.next();
        }

    }

    static private void selectOptionMode(String opt) {
        switch (opt) {
            case "remaining":
                showState();
                break;
            case "fill":
                fillMode();
                break;
            case "buy":
                buyMode();
                break;
            case "take":
                takeMode();
                break;
            default:
                System.out.println("Error option");
        }
    }

    static private void fillMode() {
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee do you want to add:");
        coffeeBeans += scanner.nextInt();

        System.out.println("Write how disposable cups of coffee do you want to add:");
        disposableCups += scanner.nextInt();
    }

    static private void buyMode() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String optStr = scanner.next();
        if (optStr.equals("back")) {
            return;
        }
        int opt = Integer.parseInt(optStr);
        switch (opt) {
            case 1:
                buyEspresso();
                break;
            case 2:
                buyLatte();
                break;
            case 3:
                buyCappuccino();
                break;
            default:
                System.out.println("Please select correct variety of coffee!");
        }
    }

    static private void buyEspresso() {
        int rtn = 0;
        if (water > 250) {
            water -= 250;
        } else {
            rtn++;
            System.out.println("Sorry, not enough water!");
        }
        milk -= 0;
        if (coffeeBeans > 16 && rtn == 0) {
            coffeeBeans -= 16;
        } else {
            rtn++;
            System.out.println("Sorry, not enough coffee beans");
        }
        if (disposableCups > 0 && rtn == 0) {
            disposableCups--;
        } else {
            rtn++;
            System.out.println("Sorry, not enough cups");
        }

        if (rtn == 0) {
            money += 4;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }


    static private void buyLatte() {
        int rtn = 0;
        if (water > 350) {
            water -= 350;
        } else {
            rtn++;
            System.out.println("Sorry, not enough water!");
        }
        if (milk > 75 && rtn == 0) {
            milk -= 75;
        } else {
            rtn++;
            System.out.println("Sorry, not enough milk!");
        }
        if (coffeeBeans > 20 && rtn == 0) {
            coffeeBeans -= 20;
        } else {
            rtn++;
            System.out.println("Sorry, not enough coffee beans");
        }
        if (disposableCups > 0 && rtn == 0) {
            disposableCups--;
        } else {
            rtn++;
            System.out.println("Sorry, not enough cups");
        }
        if (rtn == 0) {
            money += 7;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }


    static private void buyCappuccino() {

        int rtn = 0;
        if (water > 200) {
            water -= 200;
        } else {
            rtn++;
            System.out.println("Sorry, not enough water!");
        }
        if (milk > 100 && rtn == 0) {
            milk -= 100;
        } else {
            rtn++;
            System.out.println("Sorry, not enough milk!");
        }
        if (coffeeBeans > 12 && rtn == 0) {
            coffeeBeans -= 12;
        } else {
            rtn++;
            System.out.println("Sorry, not enough coffee beans");
        }
        if (disposableCups > 0 && rtn == 0) {
            disposableCups--;
        } else {
            rtn++;
            System.out.println("Sorry, not enough cups");
        }
        if (rtn == 0) {
            money += 6;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }


    static private void takeMode() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void main(String[] args) {
        inputYourOpt();

    }

}
