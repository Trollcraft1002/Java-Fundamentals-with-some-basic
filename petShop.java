import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double dogFoodPrice = 2.50;
       double catFoodPrice = 4.00;
       int dog,cat;
       dog = scanner.nextInt();
       cat = scanner.nextInt();
       double totalPrice = (cat*catFoodPrice)+(dog*dogFoodPrice);
        System.out.printf("%.2f lv.",totalPrice);
    }
}
