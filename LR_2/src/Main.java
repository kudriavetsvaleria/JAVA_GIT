import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // ===== [1] Генерація 3 чисел і максимум =====
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);
        System.out.println("Згенеровані числа: a = " + a + ", b = " + b + ", c = " + c);
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Максимальне число: " + max);

        // ===== [2] Перевірка початку рядка =====
        System.out.print("Введіть рядок: ");
        String first = scan.nextLine();
        String second = "Привіт";
        System.out.println(first.startsWith(second) ? "ТАК" : "НІ");

        // ===== [3] Парні/непарні до 0 (читаємо рядками) =====
        int evenCount = 0, oddCount = 0, oddSum = 0;
        System.out.println("Вводьте додатні числа (0 для завершення):");
        while (true) {
            String line = scan.nextLine().trim();
            if (line.isEmpty()) continue;          // пропускаємо пусті
            int num;
            try {
                num = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Не ціле число, спробуйте ще:");
                continue;
            }
            if (num == 0) break;
            if (num % 2 == 0) evenCount++;
            else { oddCount++; oddSum += num; }
        }

        System.out.println("Кількість парних чисел: " + evenCount);
        if (oddCount > 0) {
            double avgOdd = (double) oddSum / oddCount;
            System.out.println("Середнє значення непарних чисел: " + avgOdd);
        } else {
            System.out.println("Непарні числа не вводилися.");
        }

        // ===== [4] Підрахунок крапок у рядку =====
        System.out.print("Введіть рядок: ");
        String input = scan.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') count++;
        }
        System.out.println("Кількість крапок у рядку: " + count);


        scan.close();
    }
}
