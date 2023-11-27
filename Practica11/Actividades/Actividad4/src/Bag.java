import java.util.Arrays;

public class Bag<T extends Goodies> {
    private T[] list;
    private int count; // Contador de objetos que hay en la bolsa

    public Bag(int n) {
        this.list = (T[]) new Goodies[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        int valor = getIndex(null);
        if (valor != -1) {
            list[valor] = obj;
            count++;
        } else
            throw new IsFull();
    }

    public T[] getObjects() throws IsEmpty {
        int contAlguno = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null)
                contAlguno++;
        }
        if (contAlguno != 0) {
            return (T[]) list;
        } else {
            throw new IsEmpty();
        }
    }

    public T remove(T obj) throws ObjectNoExist {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(obj)) {
                T Aux = obj;
                list[i] = null;
                count--;
                return Aux;
            }
        }
        throw new ObjectNoExist();
    }

    public int getIndex(T obj) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                if (obj == null)
                    return i;
            } else if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Bag" + "\nList : " + Arrays.toString(list) + "\nCount : " + count;
    }

}
