import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // perrros

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su cuenta de banco\n");
        System.out.println("Ingrese titular");
        String titular = sc.nextLine();
        System.out.println("ingrese una cantidad si desea, si no deje en blanco");
        String respuesta = sc.nextLine();
        CuentaBanco cuenta;
        while (true) {
            try {
                cuenta = respuesta.isEmpty() ? new CuentaBanco(titular)
                        : new CuentaBanco(Double.parseDouble(respuesta), titular);
                System.out.println(cuenta);
                break;
            } catch (Exception e) {
                System.out.println("ingrese un double");
            }

        }

        String opcion;

        do {
            System.out.println("---- Menú ----");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextLine();
            double cant;
            switch (opcion) {
                case "1":
                    System.out.println("ingrese cantidad a depositar");
                    cant = sc.nextDouble();
                    cuenta.ingresar(cant);
                    System.out.println("Cantidad ingresada");
                    System.out.println(cuenta);
                    // Aquí puedes agregar la lógica para realizar un ingreso en el banco
                    break;
                case "2":
                    System.out.println("Ha seleccionado la opción Retirar");
                    cant = sc.nextDouble();
                    cuenta.retirar(cant);
                    System.out.println("cantidad retirada");
                    System.out.println(cuenta);
                    // Aquí puedes agregar la lógica para realizar un retiro en el banco
                    break;
                case "3":
                    System.out.println("Ha seleccionado la opción Salir");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
            sc.nextLine();
        } while (!opcion.equals("3"));

    }
}
