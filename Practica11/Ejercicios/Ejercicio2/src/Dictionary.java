import java.util.ArrayList;

public class Dictionary {
    // Atributos
    private ArrayList<OrderedPair> list;

    // Constructores
    public Dictionary(int n) {
        this.list = new ArrayList<OrderedPair>(n);
    }

    public Dictionary() {
        this.list = new ArrayList<OrderedPair>();
    }

    // Getters y Setters
    public ArrayList<OrderedPair> getList() {
        return list;
    }

    public void setList(ArrayList<OrderedPair> list) {
        this.list = list;
    }

    // Metodo add (agrega un par ordenado a list)
    public <K, V> void add(K key, V value) {
        OrderedPair parAgregar = new OrderedPair(key, value);
        list.add(parAgregar);
    }

    // Metodo delete
    public <K> boolean delete(K key) {
        return list.removeIf(pair -> pair.getKey().equals(key));
    }

    // Obtiene el par ordenado a través de la key

    public <K, V> V getValue(K key) throws ObjectNoExist {
        for (OrderedPair<?, ?> pair : list) {
            if (pair.getKey().equals(key)) {
                return (V) pair.getValue();
            }
        }
        throw new ObjectNoExist();
    }

    @Override
    public String toString() {
        return "Dictionary [list=" + list + "]";
    }
}