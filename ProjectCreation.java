import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String archName = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int neededHours = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",archName, neededHours, projects);

    }
}
