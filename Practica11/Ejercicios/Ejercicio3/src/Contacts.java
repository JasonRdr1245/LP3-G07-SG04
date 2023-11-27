public class Contacts {
    // Atributos
    private int dni;
    private String nombre;
    private int telefono;
    private String direccion;

    // Constructor
    public Contacts(int dni, String nombre, int telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        Contacts contactsComparar = (Contacts) obj;
        return this.getDni() == contactsComparar.getDni();
    }

    @Override
    public String toString() {
        return "DNI : " + this.dni + "\tNombre: " + this.nombre
                + "\tTelefono : " + this.telefono + "\tDireccion : "
                + this.direccion;
    }

}