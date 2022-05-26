import java.util.Scanner;

public class areaOfFifures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String form = scanner.nextLine();
        double a,b;
        double result;
        if(form.equals("square")){
            a = Double.parseDouble(scanner.nextLine());
            result = a*a;
            System.out.printf("%.3f",result);
            System.out.println();
        }else if(form.equals("rectangle")){
            a = Double.parseDouble(scanner.nextLine());
            b = Double.parseDouble(scanner.nextLine());
            result = a*b;
            System.out.printf("%.3f",result);
        }else if(form.equals("circle")){
            a = Double.parseDouble(scanner.nextLine());
            result = Math.PI*(a*a);
            System.out.printf("%.3f",result);
        }else if (form.equals("triangle")){
            a = Double.parseDouble(scanner.nextLine());
            b=Double.parseDouble(scanner.nextLine());
            result = .5 * (a*b);
            System.out.printf("%.3f",result);
        }
    }
}
