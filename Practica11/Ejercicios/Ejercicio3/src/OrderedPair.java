public class OrderedPair<K, V> implements Pair<K, V> {
    // Atributos
    private K key;
    private V value;

    // Constructor
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Metodos desarrollados
    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    // To String
    @Override
    public String toString() {
        return "\tKey: " + this.key +
                "\tValue: " + this.value + "\n";
    }

}
