import java.util.Scanner;

public class TriangleOfNums_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int startingPoint = 1;
        for (int i = 1; i <=input;i++){

            for (int j = 1; j <=startingPoint;j++){
                    System.out.printf("%d ", startingPoint);
            }
            System.out.println();
            startingPoint+=1;
        }
    }
}
