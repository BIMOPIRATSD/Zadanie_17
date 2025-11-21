package n7;

import java.util.Scanner;

public class CheckPrinter {

    public static void printCheck(String[] items) {
        String format = "%-10s  %-8s  %8s";

        for (String item : items) {
            if (item == null) continue;
            String[] parts = item.split(", ", 3);
            if (parts.length < 3) continue;

            String name = parts[0].trim();
            String quantity = parts[1].trim();
            String price = parts[2].trim();

            System.out.printf(format + "%n", name, quantity, price);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i = 0; i < n; ++i) {
            values[i] = scanner.nextLine();
        }
        printCheck(values);
    }
}
