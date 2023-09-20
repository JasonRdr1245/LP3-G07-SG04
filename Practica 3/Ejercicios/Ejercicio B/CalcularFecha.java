package calcularfecha;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CalcularFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la primera fecha:");
        Fecha fecha1 = new Fecha();
        fecha1.leer();

        System.out.println("Ingresa la segunda fecha:");
        Fecha fecha2 = new Fecha();
        fecha2.leer();

        System.out.println("Fecha 1 en formato largo: " + fecha1.Larga());
        System.out.println("Fecha 2 en formato largo: " + fecha2.Larga());

        int diasEntre = fecha1.diasEntre(fecha1, fecha2);
        System.out.println("Días entre las dos fechas: " + diasEntre);

        if (Fecha.igualQue(fecha1, fecha2)) {
            System.out.println("Las fechas son iguales.");
        } else if (Fecha.menorQue(fecha1, fecha2)) {
            System.out.println("Fecha 1 es menor que Fecha 2.");
        } else {
            System.out.println("Fecha 1 es mayor que Fecha 2.");
        }
    }
}
    

