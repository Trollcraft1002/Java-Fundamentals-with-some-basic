import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num % 10 !=0){
            if(num %7 !=0) {
                if (num % 6 != 0) {
                    if (num % 3 != 0) {
                        if (num % 2 != 0) {
                            System.out.println("Not divisible");
                        }else System.out.println("The number is divisible by 2");
                    } else System.out.println("The number is divisible by 3");
                } else System.out.println("The number is divisible by 6");
            }else System.out.println("The number is divisible by 7");
        }else System.out.println("The number is divisible by 10");
    }
}