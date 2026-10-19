public class ScoreAverage {
    public static void main (String[] args){
        int [] scores = {8,7 ,9};
        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum+=scores[i];
            System.out.println("Score "+(i+1)+ ": " + scores[i]);
        }
        int integerAverage = sum / scores.length;
        double average= (double) sum/scores.length;
        System.out.println("Average: " + integerAverage);
        System.out.printf("Decimal Division Average: %.2f%n", average);
    }
}
