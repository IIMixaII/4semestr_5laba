package Task3;

import Task1.Pair;

public class Test {
    public static void main(String[] args) {
        PairBag pairBag = new PairBag(10);

        pairBag.putPair(new Pair<>(1, "Cool String"));

        Pair<Object, Object> some = pairBag.getPair();

        System.out.println(some.getFirst());
        System.out.println(some.getSecond());
    }
}
