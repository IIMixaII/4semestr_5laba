package Task2;

public class Test {
    public static void main(String[] args) {
        Bag bag = new Bag(10);
        bag.putItem("item1");
        bag.putItem("item2");
        bag.putItem("item3");
        bag.putItem("item4");
        bag.putItem("item5");
        bag.putItem("item6");
        bag.putItem("item7");
        bag.putItem("item8");
        bag.putItem("item9");
        bag.putItem("item10");
        System.out.println(bag.getCurrentSize());
        System.out.println(bag.getItem());
        System.out.println(bag.getItem());
        System.out.println(bag.getCurrentSize());
        bag.putItem("item11");
        System.out.println(bag.getCurrentSize());
        System.out.println(bag.getItem());
    }
}
