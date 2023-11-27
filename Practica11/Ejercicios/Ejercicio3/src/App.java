import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ObjectNoExist {
        Scanner sc = new Scanner(System.in);
        // El salir lo igualamos en false para que pueda entrar al bucle
        boolean salir = false;
        // El opc sera nuestra variable donde enviaremos la opcion
        int opc;
        Dictionary agenda = new Dictionary();
        do {
            System.out.println("Menu");
            System.out.println("1.Añadir contacto");
            System.out.println("2.Buscar contacto");
            System.out.println("3.Borrar contacto");
            System.out.println("4.Mostrar contactos");
            System.out.println("5.Salir");
            System.out.println("Elegir una opcion: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("INGRESO");
                    System.out.println("DNI: ");
                    int dni = sc.nextInt();
                    sc.nextLine();
                    System.out.println("NOMBRE: ");
                    String nombre = sc.nextLine();
                    System.out.println("TELEFONO: ");
                    int telefono = sc.nextInt();
                    sc.nextLine();
                    System.out.println("DIRRECCION: ");
                    String direccion = sc.nextLine();
                    Contacts contacto = new Contacts(dni, nombre, telefono, direccion);
                    agenda.add(dni, contacto);
                    break;
                case 2:
                    System.out.println("DNI: ");
                    int dniBuscar = sc.nextInt();
                    try {

                        System.out.println(agenda.getValue(dniBuscar).toString());
                    } catch (ObjectNoExist e) {
                        System.out.println("El contacto no se encuentra en la agenda");
                    }
                    break;
                case 3:
                    System.out.println("DNI: ");
                    int dniEliminar = sc.nextInt();
                    if (agenda.delete(dniEliminar))
                        System.out.println("Se borro el contacto CORRECTAMENTE");
                    else
                        System.out.println("El contacto no se puedo borrar "
                                + "ya que NO esta en la agenda");
                    break;
                case 4:
                    ArrayList<OrderedPair> list = agenda.getList();
                    System.out.println("AGENDA DE CONTACTOS");
                    for (int i = 0; i < list.size(); i++)
                        System.out.println(list.get(i).getValue());
                    break;
                case 5:
                    // Igualamos el salir a true para que pueda salir del bucle
                    salir = true;
                    break;
                default:
                    // En el caso el usuario digite una opcion que no esta el menu
                    // Se le volvera a pedir otra opcion
                    System.out.println("Elige una opcion del 1-5");
            }
        } while (!salir);
    }
}