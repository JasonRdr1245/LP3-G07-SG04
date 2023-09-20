import java.util.Scanner;

public class PrincipalPerro {
    public static void main(String[] args) {
        int edadMai;
        double tempMai;
        Scanner sc = new Scanner(System.in);

        /*-----------Creación de objetos por cada clase-------------*/
        Perro Fido = new Perro("chihuahua", "marron");
        Perro Pelusa = new Perro("pequines", "blanco");
        Diagnostico D1 = new Diagnostico();

        /*-----------Ingreso Datos de Fido---------------*/

        System.out.println("Ingresa la edad del canino:");
        edadMai = sc.nextInt();
        Fido.setEdad(edadMai);

        System.out.println("Ingresa el peso del canino:");
        Fido.peso = sc.nextDouble();

        System.out.println("Ingresa la temperatura del canino:");
        tempMai = sc.nextDouble();
        Fido.setTemp(tempMai);

        System.out.println("-----------------------------------");
        Fido.increEdad(2);
        /*-----------Ingreso Datos de Pelusa-------------*/

        System.out.println("Ingresa la edad del canino:");
        edadMai = sc.nextInt();
        Pelusa.setEdad(edadMai);

        System.out.println("Ingresa el peso del canino:");
        Pelusa.peso = sc.nextDouble();

        System.out.println("Ingresa la temperatura del canino:");
        tempMai = sc.nextDouble();
        Pelusa.setTemp(tempMai);

        System.out.println("-----------------------------------");
        Pelusa.increEdad(5);
        /*-----------Salida de datos de Fido y Pelusa-------------*/
        Fido.salida();
        System.out.println(D1.aptoVacunaA(Fido));
        Pelusa.salida();
        System.out.println(D1.aptoVacunaA(Pelusa));
        System.out.println(D1.aptoVacunaB(Fido.getEdad(), Fido.getTemp(), Fido.peso));
    }
}
