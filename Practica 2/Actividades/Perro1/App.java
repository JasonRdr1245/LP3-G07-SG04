import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Diagnostico diagnostico = new Diagnostico();
        Perro fido = new Perro("chihuahua", "marron");
        Perro pelusa = new Perro("pequines", "blanco");
        fido.increEdad(2);
        pelusa.increEdad(5);
        Perro[] perros = {
                fido,
                pelusa
        };
        System.out.println("los perros son:");

        for (Perro perro : perros) {
            System.out.println(perro);
        }

        do {
            String opcion = "";
            int i = 1;
            System.out.println("-------MENU-----");
            for (Perro perro : perros) {
                System.out.println(i + ") Modificar " + perro.getRaza());
                i++;
            }
            opcion = sc.next();
            if (Integer.parseInt(opcion) < i) {
                System.out.print("ingrese nuevo peso para el perro");
                double peso = sc.nextDouble();
                System.out.print("ingrese nuevo edad para el perro");
                int edad=Integer.parseInt(sc.next());
                System.out.print("ingrese nuevo temperatura para el perro");
                double temp=sc.nextDouble();

                perros[Integer.parseInt(opcion) - 1].modifyAtributes(edad, temp, peso);
                System.out.print((diagnostico.aptoVacunaA(edad, peso, temp) && diagnostico.aptoVacunaB(perros[Integer.parseInt(opcion) - 1]))?"DIAGNOSTICO: el perro esta apto \n":"DIAGNOSTICO: el perro no esta apto\n" );
            }
        } while (true);

    }
}
