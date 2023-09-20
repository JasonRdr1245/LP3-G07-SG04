package agendacontactos;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class AgendaContactos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tamaño máximo de la agenda (puedes cambiarlo según tus necesidades)
        final int TAMANO_MAXIMO = 100;
        Contacto[] agenda = new Contacto[TAMANO_MAXIMO];

        // Número de contactos en la agenda (inicialmente 0)
        int numContactos = 0;

        while (true) {
            System.out.println("Menú de Agenda de Contactos");
            System.out.println("1) Añadir contacto");
            System.out.println("2) Buscar contacto");
            System.out.println("3) Modificar contacto");
            System.out.println("4) Borrar contacto");
            System.out.println("5) Mostrar contactos");
            System.out.println("6) Salir");
            System.out.print("Elija una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea pendiente

            switch (opcion) {
                case 1:
                    // Añadir contacto
                    if (numContactos < TAMANO_MAXIMO) {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Teléfono: ");
                        String telefono = sc.nextLine();
                        System.out.print("Dirección: ");
                        String direccion = sc.nextLine();

                        Contacto nuevoContacto = new Contacto(nombre, telefono, direccion);
                        agenda[numContactos] = nuevoContacto;
                        numContactos++;
                        System.out.println("Contacto añadido correctamente.");
                    } else {
                        System.out.println("La agenda está llena. No se pueden añadir más contactos.");
                    }
                    break;
                case 2:
                    // Buscar contacto
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < numContactos; i++) {
                        if (agenda[i].getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Nombre: " + agenda[i].getNombre());
                            System.out.println("Teléfono: " + agenda[i].getTelefono());
                            System.out.println("Dirección: " + agenda[i].getDireccion());
                            encontrado = true;
                            break; // Termina la búsqueda cuando se encuentra el contacto.
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    // Modificar contacto
                    System.out.print("Ingrese el nombre del contacto a modificar: ");
                    String nombreModificar = sc.nextLine();
                    encontrado = false;
                    for (int i = 0; i < numContactos; i++) {
                        if (agenda[i].getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.println("Nuevo Teléfono: ");
                            String nuevoTelefono = sc.nextLine();
                            System.out.println("Nueva Dirección: ");
                            String nuevaDireccion = sc.nextLine();
                            agenda[i].setTelefono(nuevoTelefono);
                            agenda[i].setDireccion(nuevaDireccion);
                            System.out.println("Contacto modificado correctamente.");
                            encontrado = true;
                            break; // Termina la búsqueda cuando se encuentra el contacto.
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 4:
                    // Borrar contacto
                    System.out.print("Ingrese el nombre del contacto a borrar: ");
                    String nombreBorrar = sc.nextLine();
                    for (int i = 0; i < numContactos; i++) {
                        if (agenda[i].getNombre().equalsIgnoreCase(nombreBorrar)) {
                            // Mover los contactos hacia arriba para llenar el espacio vacío
                            for (int j = i; j < numContactos - 1; j++) {
                                agenda[j] = agenda[j + 1];
                            }
                            numContactos--;
                            System.out.println("Contacto borrado correctamente.");
                            break; // Termina la búsqueda cuando se borra el contacto.
                        }
                    }
                    break;
                case 5:
                    // Mostrar contactos
                    if (numContactos == 0) {
                        System.out.println("La agenda está vacía.");
                    } else {
                        System.out.println("Lista de Contactos:");
                        for (int i = 0; i < numContactos; i++) {
                            System.out.println("Nombre: " + agenda[i].getNombre());
                            System.out.println("Teléfono: " + agenda[i].getTelefono());
                            System.out.println("Dirección: " + agenda[i].getDireccion());
                            System.out.println("------------------------");
                        }
                    }
                    break;
                case 6:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
