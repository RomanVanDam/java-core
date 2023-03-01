package Test;

import java.util.Scanner;

public class GCD {
    public static int recursiveMethod(int a, int b) {
        if (b == 0)
            return a;
        else return recursiveMethod(b, a % b);
    }

    public static void main(String[] args) {
        int a, b, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        b = scanner.nextInt();
        result = recursiveMethod(a, b);
        System.out.println("Наименьший общий делитель: " + result);
    }
}
