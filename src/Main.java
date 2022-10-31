public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация " + i);
        }
        System.out.println("Задание 1.2");
        for (int n = 10; n > 0; n--) {
            System.out.println("Итерация " + n);
        }
        System.out.println("Задание 1.3");
        for (int m = 2; m <= 17; m++) {
            if (m % 2 == 0) {
                System.out.println("Итерация " + m);}
        }
        System.out.println("Задание 1.4");
        for (int x = 10; x >= -10; x--) {
            System.out.println("Итерация " + x);
        }
        System.out.println("Задание 2.1");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным");
        }
        System.out.println("Задание 2.2");
        for (int z = 7; z <= 98; z = z + 7) {
            System.out.print(" " + z);
        }
        System.out.println();
        System.out.println("Задание 2.3");
        for (int s = 1; s <= 512; s = s * 2) {
            System.out.print(" " + s);
        }
        System.out.println();
        System.out.println("Задание 3.1");
        int deposit = 29000;
        int total = 0;
        for (int c = 1; c <= 12; c++) {
           total = total + deposit;
            System.out.println("Месяц " + c + " Сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание 3.2");
        int deposit2 = 29000;
        int total2 = 0;
        for (int c = 1; c <= 12; c++) {
            total2 = total2 + total2/100;
            total2 = total2 + deposit2;
            System.out.println("Месяц " + c + " Сумма накоплений равна " + total2 + " рублей");
        }
    }
}