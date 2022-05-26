import java.util.Scanner;

public class TheatrePromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
       var price = 0;
        if (age>=0 && age <=18){
            if(day.equals("weekday")){
                price = 12;
            }else if(day.equals("weekend")){
                price = 15;
            }else{
                price = 5;
            }
        }else if (age >18 && age <=64){
                if(day.equals("weekday")){
                    price = 18;
                }else if(day.equals("weekend")){
                    price = 20;
                }else{
                    price = 12;
                }
        }else if (age >64 && age <=122){
        if(day.equals("weekday")){
            price = 12;
        }else if(day.equals("weekend")){
            price = 15;
        }else{
            price = 10;
             }
         }else{
            System.out.println("Error!");

        }
        if(price!=0){
            System.out.printf("%s$",price);
        }
    }
}