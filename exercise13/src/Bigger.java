import java.util.Scanner;

public class Bigger {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int first = Integer.parseInt(input.nextLine());

            System.out.print("Enter second number: ");
            int second = Integer.parseInt(input.nextLine());

            if (first < 0 || second < 0) {
                System.out.println("Invalid input");
            } else {
                if (first > second) {
                    System.out.println("First value is larger");
                    System.out.println("Difference: " + (first - second));
                } else if (second > first) {
                    System.out.println("Second value is larger");
                    System.out.println("Difference: " + (second - first));
                } else {
                    System.out.println("Equal values");
                    System.out.println("Difference: 0");
                }
            }
        }
    }
