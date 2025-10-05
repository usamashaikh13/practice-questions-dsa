import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    public int capacity;

    public LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Huzaifa", 26);
        studentMap.put("Osama", 25);
        studentMap.put("Maaz", 20);
        studentMap.put("Saad", 17);
        studentMap.get("Saad");
        System.out.println(studentMap);

    }
}
//time complexity --> O(N)
//space complexity --> O(1)
