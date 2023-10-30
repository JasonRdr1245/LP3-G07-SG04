import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int cociente(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args) throws Exception {
        Scanner explorador = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.println("Introduzca un numero entero");
                int numerador = explorador.nextInt();
                System.out.println("Introduzca un denominador entero");
                int denominador = explorador.nextInt();
                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado; %d / %d = %d \n", numerador, denominador, resultado);
                // podria ocurrir un error de division sobre 0, ese error se lanza al
                // denominador ser 0;
                // el otro error se da al no leer enteros como se tenia planeqado ya que se
                // supone que se deben leer enteros
                flag = false;
            } catch (InputMismatchException e) {
                System.out.printf("\nExcepcion : %s \n", e);
                explorador.nextLine();
                System.out.println("Fallo en el programa, debe introducir un numero entero");
            } catch (ArithmeticException aritmeticE) {
                System.out.printf("\nExcepcion : %s \n", aritmeticE);
                explorador.nextLine();
                System.out.println("Fallo en el programa, debe introducir un denominador diferente de 0");
            }
        } while (flag);
    }
}
