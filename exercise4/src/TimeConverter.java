public class TimeConverter {
    private static final int MINUTES_IN_HRS = 60;
    public static void main(String[] args){
        int minutes = 135;
        int complete_hours=minutes/MINUTES_IN_HRS;
        int remaining_minutes=minutes%MINUTES_IN_HRS;
        System.out.println("Total minutes: "+ minutes + "\nComplete hours: " + complete_hours + "\nRemaining minutes: " + remaining_minutes);
    }
}
