public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
    public String getNumeroPieza() {
        return numeroPieza;
    }
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        establecerCantidad(cantidad);
        establecerPrecioPorArticulo(precioPorArticulo);
    }
    private void establecerPrecioPorArticulo(double precioPorArticulo2) {
        if(precioPorArticulo2>0){
            this.precioPorArticulo=precioPorArticulo2;
        }else{
            this.precioPorArticulo=0;
        }
    }
    private void establecerCantidad(int cantidad2) {
        if(cantidad2>0){
            this.cantidad=cantidad2;
        }else{
            this.cantidad=0;
        }
    }
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }
    public String getDescripcionPieza() {
        return descripcionPieza;
    }
    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }
    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }
    @Override
    public double obtenerMontoPago() {
        return getCantidad()*getPrecioPorArticulo();
    }





}
