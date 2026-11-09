/*
 * Student Name: Tinku kashyap
 * Roll Number: BCS2025493
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 8   , Question: 3
 */
public class main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += m[i][j];
            }

            System.out.println("Row " + (i + 1) + " sum: " + sum);
        }
    }
}