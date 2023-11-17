//creaion de la clase
public class Persona {
    private String Nombre;
    private String Apellido;
    //constructor de clase persona
    public Persona(String Nombre, String Apellido){
        this.Nombre=Nombre;
        this.Apellido=Apellido;
    }
    //codigo generado por idle para comparar los objetos persona
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
        result = prime * result + ((Apellido == null) ? 0 : Apellido.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (Nombre == null) {
            if (other.Nombre != null)
                return false;
        } else if (!Nombre.equals(other.Nombre))
            return false;
        if (Apellido == null) {
            if (other.Apellido != null)
                return false;
        } else if (!Apellido.equals(other.Apellido))
            return false;
        return true;
    }
    
}
