public class EquipmentAccess {
    public static void main(String[] args) {

        boolean trainingComplete = true;
        boolean hasReservation = true;
        boolean supervisorPresent = false;
        boolean maintenance = false;

        if (trainingComplete && !maintenance) {
            if (hasReservation || supervisorPresent) {
                System.out.println("Access allowed");
            } else {
                System.out.println("Access denied");
            }
        } else {
            System.out.println("Access denied");
        }
    }
}

