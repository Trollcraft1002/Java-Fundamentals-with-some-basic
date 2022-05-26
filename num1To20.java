import java.util.Scanner;

public class num1To20 {
    public static void main(String[] args) {
        System.out.println("Type number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println(i);
           int num =   Integer.parseInt(scanner.nextLine());
        }

    }
}
