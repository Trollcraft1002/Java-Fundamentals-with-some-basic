import java.util.Scanner;

public class MultiTablev2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    int startLine = Integer.parseInt(scanner.nextLine());
    int calc = 0;
    if (n>=1 &&n <=10) {
        for (int i = startLine; i <= 10; i++)
        {
            calc = n*i;
            System.out.printf("%d X %d = %d",n,i,calc);
            System.out.println();
        }
    }else if(n>10 && n<=100){
        calc = n * startLine;
        System.out.printf("%d X %d = %d",n,startLine,calc);
        }else {
        System.out.println();
    }

    }
    }
