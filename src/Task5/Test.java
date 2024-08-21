package Task5;

import Task1.Pair;

public class Test {
    public static void main(String[] args) {

        GenericPairBag<String> bag = new GenericPairBag<>();

        Pair<String, String> pair1 = new Pair<>("1", "2");
        Pair<String, String> pair2 = new Pair<>("3", "4");

        bag.putPair(pair1);
        bag.putPair(pair2);

        Pair<String, String> pair = bag.getPair();
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}
