public class Prestamo implements PorPagar{
    private int numeroCuotas;
    private double montoCuotas;
    
    public Prestamo(int numeroCuotas, double montoCuotas) {
        this.numeroCuotas = numeroCuotas;
        this.montoCuotas = montoCuotas;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public double getMontoCuotas() {
        return montoCuotas;
    }

    public void setMontoCuotas(double montoCuotas) {
        this.montoCuotas = montoCuotas;
    }

    @Override
    public double obtenerMontoPago() {
        return getMontoCuotas()*getMontoCuotas();
    }

    @Override
    public String toString() {
        return "Prestamo [numeroCuotas=" + numeroCuotas + ", montoCuotas=" + montoCuotas + "]";
    }
    
}
