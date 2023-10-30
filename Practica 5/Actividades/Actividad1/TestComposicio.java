/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcomposicio;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestComposicio {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // creacion de objetos
        Persona P1 = new Persona(1546, "Franco", "Paredes");
        Cuenta cuenta1 = new Cuenta(4346, 100.0);

        // El objeto que hace todos los parametros
        System.out.println("DATOS DEL OBJETO ");
        System.out.println("\n");
        System.out.println("El nombre del principal de la cuenta es: " + P1.getNombre());
        System.out.println("El Apellido del principal de la cuenta es: " + P1.getApellido());
        System.out.println("El ID de la cuenta o numero de cuenta es: " + P1.getId());
        System.out.println("El ID validado de la cuenta es: " + P1.getCuenta().getNumero());
        System.out.println("El saldo inicial de la cuenta es: " + P1.getCuenta().getSaldo());

        // Agregar valor al saldo
        System.out.println("El saldo de la cuenta es 0, ingrese un saldo: ");
        double saldo = sc.nextDouble();
        P1.getCuenta().setSaldo(saldo);
        System.out.println("El nuevo saldo de la cuenta es: " + P1.getCuenta().getSaldo());

        // Probar constructor
        System.out.println("\n");
        System.out.println("DATOS DEL OBJETO cuenta1");
        System.out.println("El nombre del principal de la cuenta es: " + cuenta1.getSaldo());
        System.out.println("El nombre del principal de la cuenta es: " + cuenta1.getNumero());
    }

}
