import java.util.Map;

public class Association < K extends Comparable<K>, V> 
    implements Comparable<K>, Map.Entry<K,V>{

    private K key;
    private V value;

    public Association (K key) {
        this.key = key;
    }

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public V setValue(V arg0) {
        this.value = arg0;
        return this.value;
    }

    @Override
    public int compareTo(K arg0) {
        return this.key.compareTo(arg0);
    }
    
}
