public class Goodies {
    // Atributos
    private int id;
    private String descripition;
    private float price;

    // Constructor
    public Goodies(int id, String descripition, float price) {
        this.id = id;
        this.descripition = descripition;
        this.price = price;
    }

    // Getters y Setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripition() {
        return this.descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Goodies) {
            Goodies goodiesComparar = (Goodies) obj;
            return this.id == goodiesComparar.getId();
        }

        return false;
    }

    // To String
    @Override
    public String toString() {
        return "ID : " + this.id + "\nDescripition : " + this.descripition
                + "\nPrice : " + this.price;
    }
}