import java.util.Scanner;

public class findBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int odd = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(odd);
            sum += odd;
            odd +=2;
        }
        System.out.printf("Sum: %d", sum);
    }
}