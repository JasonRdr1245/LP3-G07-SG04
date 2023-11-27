public class Biscuits extends Goodies {
    // Atributos
    private String tipo;
    private String forma;

    // Constructor
    public Biscuits(int id, String descripition, float price, String tipo, String forma) {
        super(id, descripition, price);
        this.tipo = tipo;
        this.forma = forma;
    }

    // Getters y Setters
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getForma() {
        return this.forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    // Equals

    @Override
    public String toString() {
        return super.toString() + "\tTipo: " + this.tipo + "\tForma: " + this.forma;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((forma == null) ? 0 : forma.hashCode());
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
        Biscuits other = (Biscuits) obj;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (forma == null) {
            if (other.forma != null)
                return false;
        } else if (!forma.equals(other.forma))
            return false;
        return true;
    }
}