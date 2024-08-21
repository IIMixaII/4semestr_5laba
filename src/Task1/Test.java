package Task1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Pair<String, Integer> pair = Pair.makePair("one", 1);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());


        String[] strings = {"hello", "world"};
        Pair<String, String[]> pair2 = Pair.makePair("one", strings);
        System.out.println(pair2.getFirst());
        System.out.println(Arrays.toString(pair2.getSecond()));
    }
}
