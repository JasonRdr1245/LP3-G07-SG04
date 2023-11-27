public class App {
    public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist, ExitsList {
        try {
            // Creacion del objeto b1
            CandyBags b1 = new CandyBags(5, "Nestle");

            Goodies g1 = new Goodies(1, "Papitas", (float) 1.8);
            Chocolates choc1 = new Chocolates(2, "Chocolate", (float) 1.5, "Dulce");
            Biscuits bis1 = new Biscuits(3, (float) 1.3, "Chocolate", "Circular");
            Soda sal1 = new Soda(4, (float) 1.80, "Cuadrado", 2.2);
            Sweet dul1 = new Sweet(5, (float) 1.50, "Cuadrado", 9.2);

            // Usando el metodo add
            b1.add(g1);
            b1.add(choc1);
            b1.add(bis1);
            b1.add(sal1);
            b1.add(dul1);

            System.out.println(b1);

            System.out.println(" ");
            System.out.println("cheapest");
            System.out.println("--------");

            System.out.println(b1.cheapest());

            System.out.println(" ");
            System.out.println("mostExpensive");
            System.out.println("-------------");
            System.out.println(b1.mostExpensive(2));

        } catch (IsFull | ExitsList exc) {
            System.out.println(exc.getMessage());
        }
    }
}