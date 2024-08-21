package Task4;

import Task1.Pair;

public class Test {
    public static void main(String[] args) {
        GPairBag<String> bag = new GPairBag<String>(10);

        bag.putPair(new Pair<String, String>("Hello", "World"));

        Pair<String, String> some = bag.getPair();

        System.out.println(some.getFirst());
        System.out.println(some.getSecond());
    }
}
