import java.util.Scanner;

public class tradingCom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double total = 0;

        switch (city){
            case "Sofia":
                if(0 < sales&&sales <=500){
                  total =  (sales * 0.05);

                }else if(500<sales && sales <=1000) {
                total =  (sales * 0.07);
            }else if(1000<sales && sales <=10000){
                    total = sales * 0.08;
                }else if (sales >10000){total = sales *.12;}
                else{
                    System.out.println("error");
                }

                break;
            case "Varna":
                if(0 < sales&&sales <=500){
                    total =  (sales * 0.045);

                }else if(500<sales && sales <=1000) {
                    total =  (sales * 0.075);
                }else if(1000<sales && sales <=10000){
                    total = sales * 0.1;
                }else if (sales >10000){total = sales *.13;}
                else{
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if(0 < sales&&sales <=500){
                    total =  (sales * 0.055);

                }else if(500<sales && sales <=1000) {
                    total =  (sales * 0.08);
                }else if(1000<sales && sales <=10000){
                    total = sales * 0.12;
                }else if (sales >10000){total = sales *.145;}
                else{
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;

        }
        if(total != 0)
        System.out.printf("%.2f",total);
    }
}
