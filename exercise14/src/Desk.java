import java.util.Scanner;
public class Desk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HELP DESK");
        System.out.println("1. Project setup");
        System.out.println("2. Compilation error");
        System.out.println("3. Incorrect result");
        System.out.print("Choose an option: ");
        int option = Integer.parseInt(input.nextLine());
        switch (option) {
            case 1:
                System.out.println("Check your project setup and JDK.");
                break;

            case 2:
                System.out.println("Check the first compiler error.");
                break;

            case 3:
                System.out.println("Review your calculations and conditions.");
                break;

            default:
                System.out.println("Choose 1, 2, or 3");
        }
    }
}
