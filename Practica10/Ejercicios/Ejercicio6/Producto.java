import java.util.Objects;

/**
 *
 * @author user
 */
public class Producto {
    //int codigo;
    String nombre_producto;
    //constructor
    public Producto(/*int codigo,*/ String nombre){
        this.nombre_producto = nombre;
        //this.codigo = codigo;
    }
    //gettes and setters

    /*public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }*/

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    //hashcode y equals

    @Override
    public int hashCode() {
        int hash = 7;
        //hash = 31 * hash + this.codigo;
        hash = 31 * hash + Objects.hashCode(this.nombre_producto);
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
        final Producto other = (Producto) obj;
        /*if (this.codigo != other.codigo) {
            return false;
        }*/
        if (!Objects.equals(this.nombre_producto, other.nombre_producto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre_producto=" + nombre_producto + '}';
    }   
    
}
