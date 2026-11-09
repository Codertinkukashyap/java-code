/*
 * Student Name: Tinku kashyap
 * Roll Number: BCS2025493
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 14  , Question:2
 */

public class main {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                count++;
            }
        }

        System.out.println("Count of g: " + count);
    }
}