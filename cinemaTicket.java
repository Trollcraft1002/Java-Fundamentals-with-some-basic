import java.util.Scanner;

public class cinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        short price = 0;
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                price = 12;
                break;
            case "Wednesday":
            case "Thursday":
                price = 14;
                break;
            case "Sunday":
            case "Saturday":
                price = 16;
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(price);
    }
}
