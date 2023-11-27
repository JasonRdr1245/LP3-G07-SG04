public class App {
    public static void main(String[] args) throws ObjectNoExist {
        try {
            Dictionary dict1 = new Dictionary();
            // Agregamos los pares Ordenados
            dict1.add("Java", "Jason Rodriguez");
            dict1.add(77031722, "Franco Paredes");
            System.out.println("ADD");
            System.out.println(dict1);
            System.out.println(" ");

            // Usando el metodo getValue
            System.out.println("GETVALUE");
            System.out.println(dict1.getValue(77031722).toString());
            System.out.println(dict1.getValue("Java").toString());

            // Usando el metodo delete
            System.out.println("DELETE");
            System.out.println(dict1.delete(77031722));
            System.out.println(dict1);
            System.out.println(" ");

            // Usando el metodo getValue
            System.out.println("GETVALUE");
            System.out.println(dict1.getValue("Java").toString());
            System.out.println(dict1.getValue(77031722).toString());

        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
    }
}