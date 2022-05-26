import java.util.Scanner;

public class printAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (a <=b){
            sum+=a;
            if(a !=b){
            System.out.print(a +" ");}
            else{
                System.out.print(a);
            }
            a++;
            if(b < a){break;}
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
