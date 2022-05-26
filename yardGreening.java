import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double totalPrice = meters * 7.61;
        double priceWithDiscount = totalPrice - (totalPrice * .18);
        double discount = totalPrice * .18;
        System.out.printf("The final price is: %.2f lv.",priceWithDiscount);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.",discount);
    }
}
