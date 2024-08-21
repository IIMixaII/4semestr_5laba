package Task2;

public class Bag {
    private Object[] items;

    public Bag(int weight) {
        this.items = new Object[weight];
    }

    public int getCurrentSize() {
        int counter = 0;
        for (Object item : items) {
            if (item != null) {
                counter++;
            }
        }
        return counter;
    }

    public Object getItem() {
        while (true) {
            int random_index = (int)Math.round(Math.random()*(items.length - 1));
            if (items[random_index] != null) {
                Object item = items[random_index];
                items[random_index] = null;
                return item;
            }
        }
    }

    public void putItem(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object is null");
        }

        if (getCurrentSize() == items.length) {
            throw new IllegalStateException("Bag is full");
        }

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = obj;
                break;
            }
        }
    }
}
