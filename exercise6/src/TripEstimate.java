import java.util.Scanner;
public class TripEstimate {
    private static final int MINUTES=60;
    public static void main (String[] args){
        double distance;
        double speed;
        double estimated_travel;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your destination: ");
        String destination = input.nextLine();
        System.out.println("What is the distance in km?: ");
        distance= input.nextDouble();
        System.out.println("What is the speed in km per hour?: ");
        speed= input.nextDouble();
        double time_in_hrs=distance/speed;
        double hours_in_minutes=time_in_hrs*MINUTES;
        System.out.println("Destination: " + destination + "\nEstimated travel time in hours: " + time_in_hrs + "\nEstimated travel time in minutes: " + hours_in_minutes);
    }
}
