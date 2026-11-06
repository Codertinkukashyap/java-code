
/*
 * Student Name: Tinku kashyap
 * Roll Number: BCS2025493
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 7   , Question: 3
 */
public class main {
    public static void main(String[] args) {
        int n = 1024;
        int count = 0;

        // Time Complexity: O(log n)
        while (n > 1) {
            n = n / 2;
            count++;
        }

        System.out.println("Halving steps: " + count);
    }
}