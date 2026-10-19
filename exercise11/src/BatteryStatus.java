import java.util.Scanner;
public class BatteryStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter battery percentage: ");
        int percentage = Integer.parseInt(input.nextLine());
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid");
        } else if (percentage < 20) {
            System.out.println("Low");
        } else if (percentage < 80) {
            System.out.println("Normal");
        } else {
            System.out.println("High");
        }
    }
}
