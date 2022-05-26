import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moneyInserted = null;
        double sumMoney = 0;
        boolean breakMe = false;
        loop:
        while (!breakMe) {

            moneyInserted = scanner.nextLine();
            switch (moneyInserted) {
                case "0.1":
                    sumMoney += Double.parseDouble(moneyInserted);
                    break;
                case "0.2":
                    sumMoney += Double.parseDouble(moneyInserted);
                    break;
                case "0.5":
                    sumMoney += Double.parseDouble(moneyInserted);
                    break;
                case "1":
                    sumMoney += Double.parseDouble(moneyInserted);
                    break;
                case "2":
                    sumMoney += Double.parseDouble(moneyInserted);
                    break;
                case "Start":
                    breakMe = true;
                    break loop;
                default:
                    double wrongMoney = Double.parseDouble(moneyInserted);
                    System.out.printf("Cannot accept %.2f", wrongMoney);
                    System.out.println();

            }

        }
        double price = 0;
        loop2:
        while (sumMoney > -0.01) {
            String product = scanner.nextLine();
            switch (product) {
                case "Nuts":
                    price = 2.0;
                    if (price > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sumMoney -= price;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Water":
                    price = .7;
                    if (price > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sumMoney -= price;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (price > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sumMoney -= price;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Soda":
                    price = .8;
                    if (price > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sumMoney -= price;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Coke":
                    price = 1;
                    if (price > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sumMoney -= price;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "End":
                    break loop2;
                default:
                    System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f", sumMoney);
    }
}