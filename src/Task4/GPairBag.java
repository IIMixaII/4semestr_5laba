package Task4;

import Task1.Pair;
import Task2.Bag;

public class GPairBag<T> extends Bag {
    public GPairBag(int weight) {
        super(weight);
    }

    public void putPair(Pair<T, T> pair) {
        super.putItem(pair);
    }

    public Pair<T, T> getPair() {
        return (Pair<T, T>) super.getItem();
    }
}
