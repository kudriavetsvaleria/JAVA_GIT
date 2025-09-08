import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // === Завдання 1 ===
        // 1) Оголосити змінні
        int i;
        char c = 'A';
        boolean f1 = false, f2;
        byte b = 1;
        int k = 5;

        // 2) Дії зі змінними
        i = b;
        System.out.println("i = " + i);

        f2 = f1;
        System.out.println("f2 = " + f2);

        Random rand = new Random();
        i = rand.nextInt(11) + 5; // від 5 до 15
        System.out.println("i = " + i);

        b = (byte) i;
        System.out.println("b = " + b);

        k = k + i;
        System.out.println("k = " + k);

        // 3) Обчислення виразу
        double y = Math.sin(Math.pow(i, 2)) + Math.pow(Math.cos(i), 2) / (i + Math.sqrt(i));
        System.out.println("y = " + y);

        // === Завдання 2 ===
        // Вивести три емодзі з таблиці Unicode
        char smile = '\u263A'; // ☺
        System.out.println(smile);

        String cat = new String(Character.toChars(0x1F639)); // 😹
        System.out.println(cat);

        System.out.println(String.valueOf(Character.toChars(0x1F63A)));

        System.out.println("\uD83D\uDE3B"); // 😻

        // === Завдання 3 ===
        // Додати до рядка "Лабораторна робота" пробіл і номер "1"
        String text = "Лабораторна робота";
        text = text + " " + "1";
        System.out.println(text);

    }
}
