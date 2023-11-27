public class Soda extends Biscuits {
    // Atributos
    private double cantSal;

    public Soda(int id, String descripition, float price, String tipo, String forma, double cantSal) {
        super(id, descripition, price, tipo, forma);
        this.cantSal = cantSal;
    }

    public double getCantSal() {
        return cantSal;
    }

    public void setCantSal(double cantSal) {
        this.cantSal = cantSal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(cantSal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Soda other = (Soda) obj;
        if (Double.doubleToLongBits(cantSal) != Double.doubleToLongBits(other.cantSal))
            return false;
        return true;
    }

}
