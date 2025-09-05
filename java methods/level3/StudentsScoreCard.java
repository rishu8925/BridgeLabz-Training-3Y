import java.util.Scanner;

public class StudentsScoreCard {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; 
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 90 + 10); 
            scores[i][1] = (int)(Math.random() * 90 + 10); 
            scores[i][2] = (int)(Math.random() * 90 + 10); 
        }
        return scores;
    }

        public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = (double) total / 3;
            double percentage = (double) total / 300 * 100; 
            avg = Math.round(avg * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percentage;
        }
        return results;
    }
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", 
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();


        int[][] scores = generateScores(n);


        double[][] results = calculateResults(scores);

        displayScoreCard(scores, results);

        sc.close();
    }
}

