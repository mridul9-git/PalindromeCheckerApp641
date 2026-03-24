import java.util.*;

public class PalindromeApp{
    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker Management System ===");
        System.out.println("-------------RA642-------------");

//UC1
        System.out.println("\nUC1 - Basic Reverse Check");
        String word1 = "MalayalaM";
        String rev1 = "";
        for (int i = word1.length() - 1; i >= 0; i--) {
            rev1 += word1.charAt(i);
        }
        System.out.println(word1 + " -> " + (word1.equals(rev1) ? "Palindrome" : "Not Palindrome"));
    }}