public class LabStation {
    private static final int MAX_USERS = 4;
    public static void main (String[] args){
        int stationNumber=3;
        String studentName="Martha";
        char row='b';
        double hoursUsed=4.0;
        boolean available=true;

        System.out.println("LAB STATION INFORMATION\n");
        System.out.println("Station Number: " + stationNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Row: " + row);
        System.out.println("Hours Used: " + hoursUsed);
        System.out.println("Available: " + available);
        System.out.println("Max Users: " + MAX_USERS);
        hoursUsed+=2.00;
        System.out.println("Updated Hours Used: " + hoursUsed);


    }
}
