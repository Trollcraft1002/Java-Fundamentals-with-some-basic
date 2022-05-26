import java.util.Scanner;

public class workingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short hours = Short.parseShort(scanner.nextLine());
        String day = scanner.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hours <=18 && hours >=10){
                    System.out.println("open");
                }else{
                    System.out.println("closed");
                }
                break;
            case "Sunday":
                System.out.println("closed");
                break;
            default:
                System.out.println("Error");
        }
    }
}
