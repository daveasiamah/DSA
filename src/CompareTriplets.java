import java.util.Arrays;

public class CompareTriplets {
    public static void compareTriplets(int[] scores1, int[] scores2) {
        int SIZE = 3;

        int first_score = 0;
        int second_score = 0;

        for (int i = 0; i < SIZE; i++) {
            if (scores1[i] > scores2[i]) {
                first_score++;
            } else if (scores1[i] < scores2[i]) {
            }
        }
        System.out.println(first_score + "," + second_score);
    }

    public static void main(String[] args) {

        int[] bobScores = {4, 5, 6};
        int[] aliceScore  = {3, 9, 6};
        compareTriplets(bobScores, aliceScore);


    }
}
