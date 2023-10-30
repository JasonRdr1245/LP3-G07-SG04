/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testagregacion;

/**
 *
 * @author user
 */
public class TestAgregacion {

    public static void main(String[] args) {

        // creacion de objetos:
        Automovil M1 = new Automovil("V4h-492", 4, "Mitsubishi", "Lancer Evo 2009");
        Motor C4 = new Motor(54826, 6500);

        // El objeto automovil que hace todos los parametros //
        System.out.println("DATOS DEL OBJETO Automovil");
        System.out.println("\n");
        M1.setMotor(C4); //relacion de agregacion 

        // Mostrar el funcionamiento //
        System.out.println("La marca del auto es: " + M1.getMarca());
        System.out.println("El modelo del auto es: " + M1.getModelo());
        System.out.println("El numero de puertas que tiene el autos es: " + M1.getNumPuertas());
        System.out.println("La placa establecida para el auto es: " + M1.getPlaca());

        // Mostrar el numero del motor y las revoluciones, esto es posible por por la relacion de agregacion
        System.out.println("El numero de motor del auto es: " + M1.getMotor().getNumMotor());
        System.out.println("El numero de motor del auto es: " + M1.getMotor().getRevPorMin());
    } 
}
