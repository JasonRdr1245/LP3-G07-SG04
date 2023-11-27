public class Chocolates extends Goodies {
    // Atributos
    private String sabor;

    // Constructor
    public Chocolates(int id, String descripition, float price, String sabor) {
        super(id, descripition, price);
        this.sabor = sabor;
    }

    // Getters y Setters
    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chocolates) {
            Chocolates ChocolatesComparar = (Chocolates) obj;
            return this.sabor.equals(ChocolatesComparar.sabor);
        }
        return false;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() + "\tSabor: " + this.sabor;
    }

}