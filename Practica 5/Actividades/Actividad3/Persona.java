public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private int fondos;
    private int deuda;
    private String tipotarjeta;


    public Persona(String nombre, int edad, int dni, int fondos, int deuda, String tipotarjeta) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.fondos = fondos;
        this.deuda = deuda;
        this.tipotarjeta = tipotarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getFondos() {
        return fondos;
    }

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public String getTipotarjeta() {
        return tipotarjeta;
    }

    public void setTipotarjeta(String tipotarjeta) {
        this.tipotarjeta = tipotarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
      "nombre='" + nombre + '\'' +
      ", edad=" + edad +
      ", dni=" + dni +
      ", fondos=" + fondos +
      ", deuda=" + deuda +
      ", tipotarjeta='" + tipotarjeta + '\'' +
      '}';
    }

}
