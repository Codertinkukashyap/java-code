/*
 * Student Name: Tinku kashyap
 * Roll Number: BCS2025493
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 13  , Question:2
 */
public class main {
    public static void main(String[] args) {
        String s = "Java";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println("Reversed: " + rev);
    }
}