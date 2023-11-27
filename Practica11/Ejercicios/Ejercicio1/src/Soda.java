public class Soda extends Biscuits {
    // Atributos
    private double cantSal;

    // Constructor
    public Soda(int id, float price, String forma, double cantSal) {
        super(id, price, "Salada", forma);
        this.cantSal = cantSal;
    }

    // Getters y Setters
    public double getCantSal() {
        return this.cantSal;
    }

    public void setCantSal(double cantSal) {
        this.cantSal = cantSal;
    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Soda) {
            Soda sodaComparar = (Soda) obj;
            return this.cantSal == sodaComparar.cantSal
                    && this.getForma().equals(sodaComparar.getForma());
        }
        return false;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() + "\tCantidad Sal : " + this.cantSal;
    }

}
