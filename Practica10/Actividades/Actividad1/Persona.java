package actividad1mg;

/**
 *
 * @author user
 */
public class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
