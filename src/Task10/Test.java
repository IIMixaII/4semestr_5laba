package Task10;

import Task9.HashFunction;
import Task9.HashTable;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        HashFunction<String> hashFunction = new PersonNameHashFunction(10);
        HashTable<Person, String> hashTable = new PersonHashTable(10, hashFunction);
        Person p1 = new Person("John", 30);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 40);
        hashTable.add(p1);
        hashTable.add(p2);
        hashTable.add(p3);
        List<Person> persons = hashTable.get("Alice25");
        for (Person person : persons) {
            System.out.println(person.name() + " " + person.age());
        }
    }
}
