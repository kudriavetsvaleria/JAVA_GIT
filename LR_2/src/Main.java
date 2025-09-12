import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Random random = new Random();
        a = random.nextInt(100);
        b = random.nextInt(100);
        c = random.nextInt(100);

        System.out.println("Згенеровані числа: a = " + a + ", b = " + b + ", c = " + c);

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Максимальне число: " + max);

        Scanner scan = new Scanner(System.in);

        String first, second;
        System.out.println("Введіть рядок: ");
        first = scan.nextLine();
        second = "Привіт";

        if (first.startsWith(second)) {
            System.out.println("ТАК");
        } else {
            System.out.println("НІ");
        }

        int evenCount = 0;
        int oddCount = 0;
        int oddSum = 0;
        System.out.println("Вводьте додатні числа (0 для завершення):");

        while (true) {
            int num = scan.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
                oddSum += num;
            }
        }

        System.out.println("Кількість парних чисел: " + evenCount);

        if (oddCount > 0) {
            double avgOdd = (double) oddSum / oddCount;
            System.out.println("Середнє значення непарних чисел: " + avgOdd);
        } else {
            System.out.println("Непарні числа не вводилися.");
        }

        scan.close();
    }
}