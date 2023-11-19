import java.util.Arrays;

public class Actividad1MG {
 
    public static void main(String[] args) throws Exception {
 
        //Arreglos
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'G', 'R', 'U', 'P', 'O'};
        Float[] floatArray = {7.7f, 4.4f, 9.9f, 11f};
        Boolean[] booleanArray = {false, true, false, true};
        
        //Arreglo objeto persona
        Persona[] personasArray = {
                new Persona("Juan", 25),
                new Persona("María", 30),
                new Persona("Carlos", 22)
        };
        
        //Imprimir con métodos genericos
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);

        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);

        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);

        System.out.printf("%nArray booleanArray contiene:%n");
        imprimirArray(booleanArray);

        System.out.printf("%nArray personasArray contiene:%n");
        imprimirArray(personasArray);
    }
    /* Metodo Geneico que no imprime objetos
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();
    }*/
    //Solo es necesario un metodo generico
    public static void imprimirArray(Object[] inputArray) {
        for (Object elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();
    }
    
}
