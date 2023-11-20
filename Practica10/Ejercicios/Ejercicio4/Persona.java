class Persona {
    private String DNI;
    private String nombres;
    private String direccion;

    public Persona(String DNI, String nombres, String direccion) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.direccion = direccion;
    }
    //metodo tostring
    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", nombres='" + nombres + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
    //METODO EQUALS Y HASHCODE HECHO POR IDLE

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nombres);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        return true;
    }
    //getters and setters

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }  
    
    
}
