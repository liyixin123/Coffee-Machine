package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");

//        System.out.println("Write how many cups of coffee you will need:");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println("For " + num + " cups of coffee you will need:");
//        System.out.println(200 * num + " ml of water");
//        System.out.println(50 * num + " ml of milk");
//        System.out.println(15 * num + " g of coffee beans");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams ml of coffee beans the coffee machine has: ");
        int gram = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cup = scanner.nextInt();

        int maxWater = water / 200;
        int maxMilk = milk / 50;
        int maxGram = gram / 15;
        int maxCup = maxWater < maxGram ? maxWater : maxGram;
        maxCup = maxCup < maxMilk ? maxCup : maxMilk;
        if (maxCup < cup) {
            System.out.println("No, I can make only " + maxCup + " cup(s) of coffee");
        } else if (maxCup == cup) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxCup - cup) + " more than that)");
        }
    }

}
