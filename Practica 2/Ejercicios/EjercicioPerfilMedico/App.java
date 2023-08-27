import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mes = leerNumero(scanner);

        System.out.print("Ingrese el año de nacimiento: ");
        int ano = leerNumero(scanner);

        System.out.print("Ingrese el día de nacimiento: ");
        int dia = leerNumero(scanner);

        System.out.print("Ingrese la altura en cm: ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, mes, ano, dia, altura, peso);

        System.out.println("\nInformación del Perfil Médico:");
        System.out.println("Nombre: " + perfil.getNombre());
        System.out.println("Apellido: " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de Nacimiento: " + perfil.getDia() + "/"
                + perfil.getMes() + "/" + perfil.getAno());
        System.out.println("Altura: " + perfil.getAltura());
        System.out.println("Peso: " + perfil.getPeso());

        int edad = perfil.getEdad();
        double imc = perfil.getIMC();
        double fcm = perfil.getFMC();

        System.out.println("\nEdad: " + edad + " años");
        System.out.println("IMC: " + imc);
        System.out.println("FCM: " + fcm);

        scanner.close();
    }

    private static int leerNumero(Scanner scanner) {
        int numero = -1;
        boolean valido = false;
        while (!valido) {
            try {
                numero = scanner.nextInt();
                valido = true;
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpia el búfer del scanner
            }
        }
        return numero;
    }

}
