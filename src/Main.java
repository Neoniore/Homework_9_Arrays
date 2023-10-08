public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] ledger = generateRandomArray();
        int sum = 0;
        for (int currValue : ledger) {
            sum += currValue;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей \n", sum);
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] ledger = generateRandomArray();
        int minValue = 200_001, maxValue = -1;
        for (int currValue : ledger) {
            if (currValue < minValue) {
                minValue = currValue;
            }
            if (currValue > maxValue) {
                maxValue = currValue;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей \n", minValue, maxValue);
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] ledger = generateRandomArray();
        int sum = 0;
        for (int currValue : ledger) {
            sum += currValue;
        }
        double avgValue = (double) sum / ledger.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей \n", avgValue);
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

}