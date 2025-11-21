package n4;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindromeWord(String str) {
        if (str == null) {
            return false;
        }
        StringBuilder reversed = new StringBuilder(str);
        return str.equals(reversed.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome checker = new Palindrome();

        System.out.print("Введите слово: ");
        String word = scanner.nextLine().trim();

        boolean result = checker.isPalindromeWord(word);
        System.out.println("Палиндром? " + result);

        scanner.close();
    }
}