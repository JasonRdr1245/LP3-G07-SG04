import java.util.Arrays;

public class Banco {

    private String nombre;
    private int begin = 0;
    private int end = 0;
    private Persona clientes[];

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCliente(Persona persona) {
        if (end < this.clientes.length) {
            this.clientes[end] = persona;
            this.end++;
        } else {
            System.out.println("no se puede porque exede el tamaño de clientes definido");
        }
    }

    public Persona darBajaCliente(Persona persona) {
        if (clientes == null) {
            return null;
        }

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                Persona personaEliminada = clientes[i];
                clientes[i] = null;
                return personaEliminada;
            }
        }

        return null;
    }

    public boolean buscarCliente(Persona persona) {
        if (clientes == null) {
            return false;
        }

        for (int i = begin; i < end; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                return true;
            }
        }

        return false;

    }

    @Override
    public String toString() {
        Persona[] clienteSubArray = Arrays.copyOfRange(clientes, begin, end);
        return "Nombre Banco:" + this.nombre + "\n"
                + "Clientes:\n"
                + Arrays.toString(clienteSubArray);

    }
}
