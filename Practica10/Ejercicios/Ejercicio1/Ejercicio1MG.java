package ejercicio1mg;

public class Ejercicio1MG {
    public static void main(String[] args) throws Exception {
        Character[] charArray = {'H', 'O', 'L', 'A'};
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        String[] a = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        System.out.printf("%nArray de cadenas contiene:%n");
        imprimirArray(a);
    }
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
    public static void imprimirArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++){
            System.out.printf("%-10s", stringArray[i]);
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
