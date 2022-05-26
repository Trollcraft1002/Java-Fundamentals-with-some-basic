import java.util.Scanner;

public class oddNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int start = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1;start < n; i+=2){
            System.out.println(i);
            start++;
            sum += i;
        }
        System.out.printf("Sum: %d",sum);
    }
}
