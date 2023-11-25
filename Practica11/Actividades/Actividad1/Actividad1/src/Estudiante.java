public class Estudiante extends Persona{
    private String especialidad;
    private Procedencia procendencia;

    public Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procendencia) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procendencia = procendencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Procedencia getProcendencia() {
        return procendencia;
    }

    public void setProcendencia(Procedencia procendencia) {
        this.procendencia = procendencia;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((procendencia == null) ? 0 : procendencia.hashCode());
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
        Estudiante other = (Estudiante) obj;
        if (procendencia == null) {
            if (other.procendencia != null)
                return false;
        } else if (!procendencia.equals(other.procendencia))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Estudiante [especialidad=" + especialidad + ", procendencia=" + procendencia + "]";
    }
    
    
}
