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

    }
}