import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double price =0;
        double totalPrice =0;
    switch (type){
        case "students":
            switch (day){
                case "friday":
                price = 8.45;
                    break;
                case "saturday":
                    price = 9.80;
                    break;
                case"sunday":
                    price = 10.46;
                    break;
            }
            if (people >= 30){
              totalPrice = price * people;
              totalPrice = totalPrice - (totalPrice *.15);
            }else totalPrice = price *people;
            break;
        case "business":
            switch (day){
                case "friday":
                    price = 10.90;
                    break;
                case "saturday":
                    price = 15.60;
                    break;
                case"sunday":
                    price = 16;
                    break;
            }
            if(people >=100){
                totalPrice = (people - 10)*price;
            }else totalPrice = price * people;
            break;
        case "regular":
            switch (day){
                case "friday":
                    price = 15;
                    break;
                case "saturday":
                    price = 20;
                    break;
                case"sunday":
                    price = 22.50;
                    break;
            }
            if(people>=10 && people <=20 ){
                totalPrice = price * people;
                totalPrice = totalPrice - (totalPrice * .05);
            }else totalPrice = price * people;
            break;

         }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}