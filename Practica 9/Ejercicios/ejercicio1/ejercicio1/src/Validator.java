import java.util.Scanner;

public class Validator {

    public static void validarNumero(String numero) throws IllegalArgumentException {

        // Verifica si la entrada tiene 9 dígitos y comienza con 9
        if (numero.matches("9\\d{8}") && numero!="") {
            return;
        } else {
            throw new IllegalArgumentException("ingrese un dato valido");
        }
    }
    public static void validarVacio(String nombre){
        if(nombre==""){
            throw new IllegalArgumentException("Entrada no válida. Por favor, ingresa un sueldo válido.");
        }
    }

    public static void validarSueldo(String sueldo) throws IllegalArgumentException {

        try {
            Double.parseDouble(sueldo);
            if (sueldo == "") {
                throw new IllegalArgumentException("Entrada no válida. Por favor, ingresa un sueldo válido.");

            }
            return;
            // Si la conversión es exitosa, sal del bucle
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Entrada no válida. Por favor, ingresa un sueldo válido.");
        }

    }
}
