package works.OOPSclad;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static String[] usernames = {"nagibator", "igor2009", "superboy"};

    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String username = sc.next();
        checkName(username);
    }

    public static void checkName(String username) throws RegisterException {
        for (String name : usernames) {
            if (name.equals(username)) {
                try {
                    throw new RegisterException("Пользователь зарегистрирован!");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите список игр, в которые играете");
        String games = sc.next();
        System.out.println("Вы зарегистрировались!");
        System.out.println("\nЧтобы поднять рейтинг, надо выигарть в игре");
        String game;
        System.out.println("\nЧтобы сыграть игру, нажмите 0");
        game = sc.next();
        for (int i = 0; i < 1; i++) {
            int a = 0;
            String[] winOrLose = {"Победа", "Поражение"};
            Random random = new Random();
            int select = random.nextInt(winOrLose.length);
            if (a == 0) {
                System.out.print("");
            } else if ((a & 1) == 0) {
                System.out.print("Победа");
            } else {
                System.out.print("Поражение");
            }
            System.out.println(a + " " + winOrLose[select]);
        }
        String result;
        int znachenie = 1;
        if (game.equals("Победа")) {
            System.out.println("Ваш рейтинг повышен на 10 очков!");
        } else if (game.equals("Поражение")) {
            System.out.println("Ваш рейтинг не изменился!");
        }
    }
}
// Проблема в том, что когда запускаю программу, у меня пользователь запускает игру, и когда вылезает результат победа/поражение
//у меня перед результатом откуда то берется 0 из-за чего дальше программа не идет и не могу сделать ее дальше
//Подскажите, пожаулйста, как этот 0 убрать
//И если я не так делаю задание, подскажие что исправить