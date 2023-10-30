public class EmpleadoProduccion extends Asalariado {
    private String turno;
    public EmpleadoProduccion(String nombre, long dni, int diasDeVacaciones, String turno) {
        super(nombre, dni,diasDeVacaciones);
        this.turno = turno;
    }
    public String getTurno() {return this.turno;}
    public void setTurno(String turno) {this.turno = turno;}
}
