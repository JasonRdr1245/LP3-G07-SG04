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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sabor == null) ? 0 : sabor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Chocolates other = (Chocolates) obj;
        if (sabor == null) {
            if (other.sabor != null)
                return false;
        } else if (!sabor.equals(other.sabor))
            return false;
        return true;
    }

}