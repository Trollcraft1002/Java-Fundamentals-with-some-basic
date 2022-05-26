import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String product = scanner.nextLine();
    String city = scanner.nextLine();
    double amount = Double.parseDouble(scanner.nextLine());
    double coffee,water,beer,sweets,peanuts,productPrize = 0;

        switch (product){
            case "coffee":
                if (city.equals("Sofia")) {
                    productPrize = 0.50;
                }else if (city.equals("Plovdiv")) {
                    productPrize = .40;
                }else {
                    productPrize = .45;
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    productPrize = 0.80;
                }else {
                    productPrize = .7;
                }
                break;
            case "beer":
                if (city.equals("Sofia")){
                productPrize = 1.20;}
                else if (city.equals("Plovdiv")){
                    productPrize =1.15;
                }else {
                    productPrize = 1.10;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")){
                productPrize = 1.45;}
                else if(city.equals("Plovdiv")){
                    productPrize = 1.30;
                }else{productPrize=1.35;}
                break;
            case "peanuts":
                if(city.equals("Sofia")){
                productPrize = 1.60;}
                else if(city.equals("Plovdiv")){
                    productPrize = 1.50;
                }else{productPrize = 1.55;}
                break;
            default:
                System.out.println("error");
                break;
             
        }
        System.out.println(productPrize * amount);
    }
}
