public class CuentaBanco {
    private double cantidad = 0;
    private String titular;

    public CuentaBanco(double cantidad, String titular) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public CuentaBanco(String titular) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        this.cantidad = (cantidad > 0) ? this.cantidad += cantidad : this.cantidad;
    }

    public void retirar(double cantidad) {
        this.cantidad = ((this.cantidad - cantidad) < 0) ? 0 : this.cantidad - cantidad;
    }

    @Override

    public String toString() {
        return String.format("titular: %s\ncantidad: %f", titular, cantidad);
    }

}
