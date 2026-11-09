/*
 * Student Name: Tinku kashyap
 * Roll Number: BCS2025493
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 9   , Question: 1
 */
public class main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row: ");

        for (int j = 0; j < 3; j++) {
            System.out.print(m[0][j] + " ");
        }

        System.out.println();

        System.out.print("Last row: ");

        for (int j = 0; j < 3; j++) {
            System.out.print(m[2][j] + " ");
        }
    }
}