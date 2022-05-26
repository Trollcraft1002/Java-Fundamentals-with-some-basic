import java.util.Scanner;

public class PadawanEq_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        int lightSabers = (int) Math.ceil( students + (students*0.10));
        int belts = students -(students / 6);
        double total = (lightSabers * lightSaberPrice) + (students*robesPrice)+(belts*beltsPrice);
        if(moneyAvailable >=total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        }else{
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(moneyAvailable-total));
        }
    }
}
