package n3;

import java.util.Scanner;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        if (text == null || substring == null || substring.isEmpty()) {
            return 0;
        }

        StringBuilder sb = new StringBuilder(text);
        int count = 0;
        int index;

        while ((index = sb.indexOf(substring)) != -1) {
            count++;
            sb.delete(0, index + substring.length());
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindRepeats finder = new FindRepeats();

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Введите подстроку для поиска: ");
        String substring = scanner.nextLine();

        int result = finder.numberOfRepeats(text, substring);
        System.out.println("Количество вхождений: " + result);

        scanner.close();
    }
}
