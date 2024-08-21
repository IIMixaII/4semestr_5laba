package Task6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество команд: ");
        int numTeams = scanner.nextInt();

        if (numTeams <= 1 || numTeams % 2 != 0) {
            System.out.println("Некорректное количество команд. Используется значение по умолчанию (8).");
            numTeams = 8;
        }

        Tournament tournament = new Tournament(numTeams);
        System.out.println("Победитель турнира: " + tournament.playTournament());
    }
}
