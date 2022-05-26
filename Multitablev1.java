import java.util.Scanner;

public class Multitablev1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int calc = 0;
        for (int i = 1; i <=10; i++){
            calc = n * i;
            System.out.printf("%d X %d = %d",n,i,calc);
            System.out.println();
            }
        }
    }
