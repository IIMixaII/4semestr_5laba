package Task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DList<T1, T2> {
    private final List<T1> list1;
    private final List<List<T2>> list2;

    public DList() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }

    public void add(T1 value, List<T2> sublist) {
        list1.add(value);
        list2.add(sublist);
    }

    public Map<T1, List<T2>> getByIndex(int index) {
        Map<T1, List<T2>> resp = new HashMap<>();
        resp.put(list1.get(index), list2.get(index));
        return resp;
    }

    public Map<T1, List<T2>> getByKey(T1 key) {
        Map<T1, List<T2>> resp = new HashMap<>();
        int index = list1.indexOf(key);
        if (index >= 0) {
            resp.put(list1.get(index), list2.get(index));
        } else
            throw new IllegalArgumentException("Key not found");
        return resp;
    }


    public void removeByIndex(int index) {
        list1.remove(index);
        list2.remove(index);
    }

    public void removeByKey(T1 key) {
        int index = list1.indexOf(key);
        if (index >= 0) {
            list1.remove(index);
            list2.remove(index);
        } else
            throw new IllegalArgumentException("Key not found");
    }
}
