import java.util.Objects;

/**
 *
 * @author user
 */
// Clase Estudiante que hereda de Persona
class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String DNI, String nombres, String direccion, String carrera) {
        super(DNI, nombres, direccion);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                "} " + super.toString();
    }
    //METODO EQUALS Y HASHCODE HECHO POR IDLE
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (!Objects.equals(this.carrera, other.carrera)) {
            return false;
        }
        return true;
    }
    
 
