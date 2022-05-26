import java.util.Scanner;

public class numberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short  num = Short.parseShort(scanner.nextLine());
        if (num>0 && num<=100 ||num<0 && num>=-100 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
