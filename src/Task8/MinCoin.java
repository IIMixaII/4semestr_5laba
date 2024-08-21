package Task8;

import Task7.DList;

import java.util.ArrayList;
import java.util.Arrays;

public class MinCoin {

    public static ArrayList<Integer> minCoins(int[] denominations, int total) {
        Arrays.sort(denominations);

        ArrayList<Integer> resp = new ArrayList<>();
        for (int i = denominations.length - 1; i >= 0 && total > 0; i--) {
            while (total >= denominations[i]) {
                total -= denominations[i];
                resp.add(denominations[i]);
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        int[] denominations = {1, 2, 5, 10};
        int[] denominations2 = {1, 4, 7, 9};

        DList<Integer, Integer> dList = new DList<>();
        dList.add(3, minCoins(denominations, 3));
        dList.add(14, minCoins(denominations2, 14));
        System.out.println("Кол-во монет для" + 3 + " рублей: " + dList.getByKey(3).values());
        System.out.println("Кол-во монет для " + 14 + " рублей: " + dList.getByKey(14).values());
    }
}

