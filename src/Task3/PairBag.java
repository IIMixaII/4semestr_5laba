package Task3;

import Task1.Pair;
import Task2.Bag;

public class PairBag extends Bag {

    public PairBag(int weight) {
        super(weight);
    }

    public Pair<Object, Object> getPair() {
        return (Pair<Object, Object>) super.getItem();
    }

    public void putPair(Pair<Object, Object> pair) {
        super.putItem(pair);
    }
}
