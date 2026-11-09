/*
 * Student Name: Tinku kashyap
 * Roll Number: BCS2025493
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 14  , Question:1
 */

public class main {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}