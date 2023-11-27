
//actividad4
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist {

        try {
            // Instanciacion de la clase generica para Goodies
            Bag<Goodies> bagGoodies = new Bag<Goodies>(2);

            // Usando el metodo add
            Goodies g1 = new Goodies(1, "Galletas", (float) 1.5);
            Goodies g2 = new Goodies(2, "Chocolate", (float) 2.5);
            Goodies g3 = new Goodies(3, "Papitas", (float) 1.5);

            bagGoodies.add(g1);
            bagGoodies.add(g2);
            System.out.println(bagGoodies);

            // Usando el metodo getIndex
            System.out.print("El Galletas se encuentra en la Posicion : ");
            System.out.println(bagGoodies.getIndex(g1));
            System.out.print("El Papitas se encuentra en la Posicion : ");
            System.out.println(bagGoodies.getIndex(g3));

            // Usando el metodo remove
            System.out.println("Se elimino el numero : " + bagGoodies.remove(g2));
            System.out.println(bagGoodies);
            bagGoodies.add(g3);
            System.out.println(bagGoodies);

            // Usando el metodo getObjects
            System.out.println("Usando getObjects");
            System.out.println(Arrays.toString(bagGoodies.getObjects()));
            System.out.println(" ");
            System.out.println(" ");

            // Instanciacion de la clase generica para Chocolates
            Bag<Chocolates> bagChocolates = new Bag<Chocolates>(2);

            // Usando el metodo add
            Chocolates choc1 = new Chocolates(1, "Chocolate", (float) 1.5, "Amargo");
            Chocolates choc2 = new Chocolates(2, "Chocolate", (float) 2.5, "Dulce");
            Chocolates choc3 = new Chocolates(3, "Chocolate", (float) 2.5, "Cafe");

            bagChocolates.add(choc1);
            bagChocolates.add(choc2);
            System.out.println(bagChocolates);

            // Usando el metodo getIndex
            System.out.print("El Chocolate Amargo se encuentra en la Posicion : ");
            System.out.println(bagChocolates.getIndex(choc1));
            System.out.print("El Chocolate de Cafe se encuentra en la Posicion : ");
            System.out.println(bagChocolates.getIndex(choc3));

            // Usando el metodo getObjects
            System.out.println("Usando getObjects");
            System.out.println(Arrays.toString(bagChocolates.getObjects()));
            System.out.println(" ");
            System.out.println(" ");

            // Instanciacion de la clase generica para Biscuits
            Bag<Biscuits> bagBiscuits = new Bag<Biscuits>(2);

            // Usando el metodo add
            Biscuits bis1 = new Biscuits(1, "Galleta", (float) 1.8, "Dulce", "Estrella");
            Biscuits bis2 = new Biscuits(2, "Galleta", (float) 1.5, "Salada", "Cuadrado");
            Biscuits bis3 = new Biscuits(3, "Galleta", (float) 1.7, "Dulce", "Corazon");
            bagBiscuits.add(bis1);
            bagBiscuits.add(bis2);
            System.out.println(bagBiscuits);

            // Usando el metodo getIndex
            System.out.print("Galleta Dulce en forma de Estrella se encuentra en la Posicion : ");
            System.out.println(bagChocolates.getIndex(choc1));
            System.out.print("Galleta Dulce en forma de Corazon se encuentra en la Posicion : ");
            System.out.println(bagChocolates.getIndex(choc3));
            System.out.println(" ");
            System.out.println(" ");

            // Instanciaci�n de la clase generica para Soda
            Bag<Soda> bagSoda = new Bag<Soda>(2);

            // Usando el metodo add para Soda
            Soda sal1 = new Soda(1, "Galleta", (float) 1.8, "Cuadrado", "Cudrado", 2.2); // Corregido el tipo y la forma
            Soda sal2 = new Soda(1, "Galleta", (float) 1.8, "Rectangulo", "Rectangulo", 3.1); // Corregido el tipo y la
                                                                                              // forma
            Soda sal3 = new Soda(3, "Galleta", (float) 1.7, "Cuadrado", "Cuadrado", 4.0); // Corregido el tipo y la
                                                                                          // forma
            bagSoda.add(sal1);
            bagSoda.add(sal2);
            System.out.println(bagSoda); // Corregido para imprimir bagSoda en lugar de bagBiscuits

            // Usando el metodo getIndex
            System.out.print("Galleta SALADA en forma de Cuadrado con 2.2 ml sal se encuentra en la Posicion : ");
            System.out.println(bagSoda.getIndex(sal1));
            System.out.print("Galleta SALADA en forma de Cuadrado con 4.0 ml sal se encuentra en la Posicion : ");
            System.out.println(bagSoda.getIndex(sal3));
            System.out.println(" ");
            System.out.println(" ");

            // Instanciacion de la clase generica para Sweet
            Bag<Sweet> bagSweet = new Bag<Sweet>(2);

            // Usando el metodo add para Sweet
            Sweet dul1 = new Sweet(1, "Galleta", (float) 1.8, "Cuadrado", "Cuadrado", 9.2); // Corregido el tipo y la
                                                                                            // forma
            Sweet dul2 = new Sweet(1, "Galleta", (float) 1.8, "Corazon", "Corazon", 8.1); // Corregido el tipo y la
                                                                                          // forma
            Sweet dul3 = new Sweet(3, "Galleta", (float) 1.7, "Estrella", "Estrella", 7.0); // Corregido el tipo y la
                                                                                            // forma
            bagSweet.add(dul1);
            bagSweet.add(dul2);
            System.out.println(bagSweet);

        } catch (IsFull | IsEmpty | ObjectNoExist exc) {
            System.out.println(exc.getMessage());
        }

    }

}
