/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcomposicion;

/**
 *
 * @author user
 */
public class TestComposicion {
	public static void main(String[] args) {

		Cuenta c1 = new Cuenta(1000);
		Persona p1 = new Persona(1,"Franco", "Paredes");
		System.out.println(p1);
		c1.depositar(100);
		System.out.println(c1);
		
		Cuenta c2 = new Cuenta(5000);
		Persona p2 = new Persona(2,"Jason", "Rodriguez",'B');
		System.out.println(p2); 
		c2.depositar(500);
		System.out.println(c2);
		c2.retirar(100);
		System.out.println(c2);
		
		Cuenta c3 =new Cuenta(8000);
		Persona p3 = new Persona(3,"Julio", "Alacachofa",'E');
		System.out.println(p3);
		c1.depositar(800);
		System.out.println(c3);
	}
}
