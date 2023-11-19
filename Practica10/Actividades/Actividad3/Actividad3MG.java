
public class Actividad3MG {
    public static void main(String[] args) throws Exception {
        // Declaración de arreglos de diferentes tipos
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'G', 'R', 'U', 'P', 'O'};

        // Impresión de los arreglos
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);

        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);

        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.println("\nImpresion con limites:");

        // Impresión de subconjuntos de los arreglos con límites específicos
        System.out.printf("%nArray integerArray contiene");
        imprimirArray(intArray, 0, 3);

        System.out.printf("%nArray doubleArray contiene");
        imprimirArray(doubleArray, 2, 10);

        System.out.printf("%nArray charArray contiene");
        imprimirArray(charArray, 1, 2);
    }

    // Método genérico para imprimir un arreglo completo
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();
    }

    // Validación de límites para evitar índices fuera de rango
    public static void validacion(int longitud, int limiteInferior, int limiteSuperior)
            throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteInferior > longitud ||
            limiteSuperior < 0 || limiteSuperior > longitud ||
            limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Limites Invalidos");
        }
    }

    // Método genérico para imprimir un subconjunto del arreglo dentro de límites específicos
    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) {
        try {
            validacion(inputArray.length, limiteInferior, limiteSuperior);
            for (int i = limiteInferior; i < limiteSuperior; i++) {
                System.out.print(inputArray[i]);
                System.out.print(", ");
            }
        } catch (LimiteInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
