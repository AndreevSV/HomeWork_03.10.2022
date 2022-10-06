public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task2_1();
       task2_2();
       task2_3();
       task3_1();
       task3_2();
    }

    public static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i);
        }
    }
    public static void task2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Число " + i);
        }
    }

    public static void task3() {
        for (int i = 2; i <= 17; i=i+2) {
            System.out.println("Число " + i);
        }
    }

    public static void task4() {
        for (int i = 10; i >= -10; i=i-1) {
            System.out.println("Число " + i);
        }
    }

    public static void task2_1() {
        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i + " год является високосным ");
        }
    }

    public static void task2_2() {
        for (int i = 7; i <= 98; i=i+7) {
            System.out.println("Число " + i);
        }
    }

    public static void task2_3() {
        for (int i = 1; i <= 512; i=2*i) {
            System.out.println("Число " + i);
        }
    }

    public static void task3_1() {
        int accumulation = 0;
        for (int i = 1; i <= 12; i++) {
            accumulation = 29000 * i;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulation + " рублей");
        }
    }

    public static void task3_2() {
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = accumulation + total;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
