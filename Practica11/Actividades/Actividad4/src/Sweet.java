public class Sweet extends Biscuits {
    // Atributos
    private double cantAzucar;

    public Sweet(int id, String descripition, float price, String tipo, String forma, double cantAzucar) {
        super(id, descripition, price, tipo, forma);
        this.cantAzucar = cantAzucar;
    }

    public double getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(double cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(cantAzucar);
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
        Sweet other = (Sweet) obj;
        if (Double.doubleToLongBits(cantAzucar) != Double.doubleToLongBits(other.cantAzucar))
            return false;
        return true;

    }

    @Override
    public String toString() {
        return "Sweet [cantAzucar=" + cantAzucar + "]";
    }

}
