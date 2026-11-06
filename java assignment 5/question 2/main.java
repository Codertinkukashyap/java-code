/*
 * Student Name: Tinku kashyap
 * Roll Number: BCS2025493
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 5, Question: 2
 */
public class main {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 33, 21};
        int sum = 0;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
    }
}