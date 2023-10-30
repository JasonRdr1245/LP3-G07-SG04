import java.util.ArrayList;
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
                clientes[i] = clientes[this.end - 1];
                clientes[this.end - 1] = null;
                this.end--;
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

    void clienteTipo() {

        ArrayList<Persona> clientesNeto = new ArrayList<Persona>();
        ArrayList<Persona> clientesBancaExclusiva = new ArrayList<Persona>();
        ArrayList<Persona> clientesEmpresarial = new ArrayList<Persona>();
        for (Persona persona : clientes) {
            if (persona != null && persona.getCuenta().equals("C")) {
                clientesNeto.add(persona);
            } else if (persona != null && persona.getCuenta().equals("B")) {
                clientesBancaExclusiva.add(persona);
            } else if (persona != null && persona.getCuenta().equals("E")) {
                clientesEmpresarial.add(persona);
            }
        }
        System.out.println("Clientes: \n" + clientesNeto.toString());
        System.out.println("Clientes Banca exclusiva: \n" + clientesBancaExclusiva.toString());
        System.out.println("Clientes Empresariales: \n" + clientesEmpresarial.toString());
    }

    @Override()
    public String toString() {
        Persona[] clienteSubArray = Arrays.copyOfRange(clientes, begin, end);
        return "Nombre Banco:" + this.nombre + "\n"
                + "Clientes:\n"
                + Arrays.toString(clienteSubArray);

    }
}
