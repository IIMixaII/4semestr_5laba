package Task10;

import Task9.HashFunction;

public class PersonNameHashFunction extends HashFunction<String> {
    public PersonNameHashFunction(int tableSize) {
        super(tableSize);
    }

    public int hash(String s) {
        if (s == null) {
            return 0;
        }
        return Math.abs(s.hashCode() % tableSize);
    }
}
