/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testagreagacion;

/**
 *
 * @author user
 */
public class TestAgreagacion {

    public static void main(String[] args) {

        // creacion de objetos:
        Automovil M1 = new Automovil("V4h-492", 4, "Mitsubishi", "Lancer Evo 2009");
        Motor C8 = new Motor(54826, 6500);

        System.out.println("DATOS DEL OBJETO Automovil \n");
        M1.setMotor(C8); //relacion de agregacion  
        System.out.println(M1);
        Automovil Gol = new Automovil("v8g-848", 4, "Volkswagen", "Golf");
        System.out.println("DATOS DEL OBJETO Automovil \n");       

        System.out.println(Gol);
    } 
}
