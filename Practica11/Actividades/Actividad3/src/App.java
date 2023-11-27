import java.util.Arrays;

//Actividad3
public class App {

    public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist {
        try {
            // Instanciacion de la clase generica para Integer
            Bag<Integer> bagInt = new Bag<Integer>(3);

            // Usando el metodo add
            bagInt.add(1);
            bagInt.add(2);
            bagInt.add(4);
            System.out.println(bagInt);

            // Usando el metodo getIndex
            System.out.print("El numero 1 se encuentra en la Posicion : ");
            System.out.println(bagInt.getIndex(1));
            System.out.print("El numero 5 se encuentra en la Posicion : ");
            System.out.println(bagInt.getIndex(5));

            // Usando el metodo remove
            System.out.println("Se elimino el numero : " + bagInt.remove(1));
            System.out.println(bagInt);
            bagInt.add(5);
            System.out.println(bagInt);

            // Usando el metodo getObjects
            System.out.println("Usando getObjects");
            System.out.println(Arrays.toString(bagInt.getObjects()));
            System.out.println(" ");
            System.out.println(" ");

            // Instanciacion de la clase generica para String
            Bag<String> bagString = new Bag<String>(2);

            // Usando el metodo add
            bagString.add("Hola");
            bagString.add("Adios");
            System.out.println(bagString);

            // Usando el metodo getIndex
            System.out.print("Hola se encuentra en la Posicion : ");
            System.out.println(bagString.getIndex("Hola"));
            System.out.print("Buenas Tardes se encuentra en la Posicion : ");
            System.out.println(bagString.getIndex("Buenas Tardes"));

            // Usando el metodo remove
            System.out.println("Se elimino el numero : " + bagString.remove("Adios"));
            System.out.println(bagString);

            // Usando el metodo getObjects
            System.out.println("Usando getObjects");
            System.out.println(Arrays.toString(bagInt.getObjects()));
            System.out.println(" ");
            System.out.println(" ");

            // Instanciacion de la clase generica para Persona
            Bag<Persona> bagPersona = new Bag<Persona>(2);

            // Usando el metodo add
            Persona p1 = new Persona("Franco Paredes", "Mariano Melgar", "111111111");
            Persona p2 = new Persona("Jason Rodriguez", "Jose Luis Bustamante y Rivero", "222222222");
            Persona p3 = new Persona("Salvador Zamora", "Cerro Colorado", "333333333");

            bagPersona.add(p1);
            bagPersona.add(p2);
            System.out.println(bagPersona);

            // Usando el metodo getIndex
            System.out.print(p1.getNombres() + " se encuentra en la Posicion : ");
            System.out.println(bagPersona.getIndex(p1));
            System.out.print(p2.getNombres() + " se encuentra en la Posicion : ");
            System.out.println(bagPersona.getIndex(p3));

            // Usando el metodo remove
            System.out.println("Se elimino " + p2.getNombres());
            bagPersona.remove(p2);
            System.out.println(bagPersona);

            // Usando el metodo getObjects
            System.out.println("Usando getObjects");
            System.out.println(Arrays.toString(bagPersona.getObjects()));
            System.out.println(" ");
            System.out.println(" ");

        } catch (IsFull | IsEmpty | ObjectNoExist exc) {
            System.out.println(exc.getMessage());
        }
    }
}