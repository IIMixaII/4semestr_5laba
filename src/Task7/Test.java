package Task7;

import Task3.PairBag;
import Task1.Pair;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        DList<String, PairBag> dlist = new DList<>();

        PairBag pairBag = new PairBag(10);
        pairBag.putPair(new Pair<>("Hello", "World"));

        dlist.add("Hello", List.of(pairBag));

        System.out.println(dlist.getByIndex(0));
        System.out.println(dlist.getByKey("Hello"));

        dlist.removeByKey("Hello");

        dlist.add("Hello2", List.of(pairBag));

        System.out.println(dlist.getByIndex(0));
        System.out.println(dlist.getByKey("Hello2"));
    }
}
