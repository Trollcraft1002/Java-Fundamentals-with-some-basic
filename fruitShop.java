import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        float foodPrize = 0.00f;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        foodPrize = 2.50f;
                        break;
                    case "apple":
                        foodPrize = 1.20f;
                        break;
                    case "orange":
                        foodPrize = 0.85f;
                        break;
                    case "grapefruit":
                        foodPrize = 1.45f;
                        break;
                    case "kiwi":
                        foodPrize = 2.70f;
                        break;
                    case "pineapple":
                        foodPrize = 5.50f;
                        break;
                    case "grapes":
                        foodPrize = 3.85f;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Sunday":
            case "Saturday":
                switch (fruit) {
                    case "banana":
                        foodPrize = 2.70f;
                        break;
                    case "apple":
                        foodPrize = 1.25f;
                        break;
                    case "orange":
                        foodPrize = 0.9f;
                        break;
                    case "grapefruit":
                        foodPrize = 1.60f;
                        break;
                    case "kiwi":
                        foodPrize = 3.00f;
                        break;
                    case "pineapple":
                        foodPrize = 5.60f;
                        break;
                    case "grapes":
                        foodPrize = 4.20f;
                        break;
                    default:
                        System.out.println("error");
                        break;

                }
                break;
            default:
                System.out.println("error");

        }
        if (foodPrize != 0) {
            System.out.printf("%.2f", foodPrize * amount);
        }
    }
}

