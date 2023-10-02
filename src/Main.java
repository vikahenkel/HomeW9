import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] zahlungen = generateRandomArray();
        System.out.println(Arrays.toString(zahlungen));
        int sum = 0;
        for (int i = 0; i < zahlungen.length; i++) {
            sum += zahlungen[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        int[] zahlungen = generateRandomArray();
        System.out.println(Arrays.toString(zahlungen));
        int min = zahlungen[0];
        int max = zahlungen[0];
        for (int zahlung : zahlungen) {
            if (zahlung < min) {
                min = zahlung;
            }
            if (zahlung > max) {
                max = zahlung;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] zahlungen = generateRandomArray();
        System.out.println(Arrays.toString(zahlungen));
        double sum = 0;
        for (int i = 0; i < zahlungen.length; i++) {
            sum += zahlungen[i];
        }
        double durchschnitt = sum / zahlungen.length;
        System.out.println("Средняя сумма трат за месяц составила " + durchschnitt + " рублей");
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
