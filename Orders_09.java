import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double total = 0;
        for (int i = 1; i <=orders; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());

            double orderTotal = (days * capsules)*price;
            System.out.printf("The price for the coffee is: $%.2f%n",orderTotal);
         total+=orderTotal;
        }
        System.out.printf("Total: $%.2f",total);
    }
}
