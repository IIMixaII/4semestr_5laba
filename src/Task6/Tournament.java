package Task6;

import Task1.Pair;
import Task2.Bag;
import Task5.GenericPairBag;

import java.util.Scanner;

public class Tournament {
    private final Bag teamsBag;
    private final GenericPairBag<String> pairsBag;

    public Tournament(int numTeams) {
        if (numTeams <= 1 || numTeams % 2 != 0) {
            throw new IllegalArgumentException("Некорректное количество команд");
        }

        // Создаем мешок команд
        teamsBag = new Bag(numTeams);
        for (int i = 1; i <= numTeams; i++) {
            teamsBag.putItem("Команда " + i);
        }
        pairsBag = new GenericPairBag<>();
    }

    public String playTournament() {

        while (teamsBag.getCurrentSize() > 1) {
            String team1 = (String) teamsBag.getItem();
            String team2 = (String) teamsBag.getItem();
            pairsBag.putPair(new Pair<>(team1, team2));
        }

        while (pairsBag.getCurrentSize() > 0) {
            Pair<String, String> pair = pairsBag.getPair();
            String winner = playMatch(pair.getFirst(), pair.getSecond());
            teamsBag.putItem(winner);
        }

        if (teamsBag.getCurrentSize() != 1) {
            return playTournament();
        } else
            return (String) teamsBag.getItem();
    }

    private String playMatch(String team1, String team2) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n >> " + team1 + " против " + team2);
            System.out.print("\nКакая команда выиграла? \n\n\t1 - " + team1 + "\n\t2 - " + team2 + "\n\nВвод: ");
            int winner = scanner.nextInt();
            if (winner == 1) {
                return team1;
            } else if (winner == 2) {
                return team2;
            } else {
                System.out.println("Некорректный выбор, попробуйте еще раз.");
            }
        }
    }
}
