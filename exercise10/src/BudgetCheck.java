import java.util.Scanner;
public class BudgetCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        double budget = Double.parseDouble(input.nextLine());
        System.out.print("Enter item cost: ");
        double cost = Double.parseDouble(input.nextLine());
        if (budget >= cost) {
            double remaining = budget - cost;
            System.out.println("Purchase is possible");
            System.out.println("Remaining amount: " + remaining);
        } else {
            double needed = cost - budget;
            System.out.println("Not enough money");
            System.out.println("Additional money required: " + needed);
        }
    }
}

