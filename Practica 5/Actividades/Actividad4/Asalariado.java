public class Asalariado {
    private String nombre;
    private long dni;
    private int diasDeVacaciones;

    public Asalariado(String nombre, long dni, int diasDeVacaciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasDeVacaciones = diasDeVacaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getDiasDeVacaciones() {
        return diasDeVacaciones;
    }

    public void setDiasDeVacaciones(int diasDeVacaciones) {
        this.diasDeVacaciones = diasDeVacaciones;
    }
}
