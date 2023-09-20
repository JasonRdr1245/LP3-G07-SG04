package evacrediticia;

/**
 *
 * @author user
 */
public class PersonaCredito {
    private int sexo;
    private int trabajo;
    private int sueldo;

    public int getSexo() {
        return sexo;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public int getTrabajo() {
        return trabajo;
    }
    public void setTrabajo(int trabajo) {
        this.trabajo = trabajo;
    }
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona [sexo=" + sexo + ", sueldo=" + sueldo + ", trabajo=" + trabajo + "]";
    }
    
}
