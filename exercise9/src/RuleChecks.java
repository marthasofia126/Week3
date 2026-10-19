public class RuleChecks {
    public static void main(String[] args) {

        int battery = 15;
        boolean lowBattery = battery < 20;
        System.out.println("Battery below 20: " + lowBattery);

        int members = 4;
        boolean Group = members <= 4;
        System.out.println("At most 4 members: " + Group);

        double weight = 2.5;
        boolean validWeight = weight >= 2.5;
        System.out.println("Weight at least 2.5: " + validWeight);

        int menuChoice = 2;
        boolean other = menuChoice != 3;
        System.out.println("Menu choice is not 3: " + other);

        String response = " yes ";
        String cleanedyes = response.trim();
        boolean yes = cleanedyes.equals("yes");
        System.out.println("Response is yes: " + yes);
    }
}
