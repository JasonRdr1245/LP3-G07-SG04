/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appejercicio3ex;
import java.io.IOException;

   
public class AppEjercicio3Ex {

	public static void main(String[] args) throws ExcepcionNumero, ExcepcionSalida, ExcepcionBlanco, ExcepcionVocal {
		procesar();//se ejecuta procesaar
	}

	public static void procesar() throws ExcepcionNumero, ExcepcionSalida, ExcepcionBlanco, ExcepcionVocal {
		String seguir = "si";
		while (seguir == "si") {
			try {
				System.out.println("Ingrese un char: ");
				LeerEntrada charEv = new LeerEntrada(System.in); //se guarda el ingreso por teclado

				char valido = charEv.getChar(); //guarda el char en valido

				if (valido == 'a' || valido == 'e' || valido == 'i' || valido == 'o' || valido == 'u' ||
					valido == 'A' || valido == 'E' || valido == 'I' || valido == 'O' || valido == 'U') {
					throw new ExcepcionVocal("Se encontro una excepcion de vocal"); //evalua vocales
				}

				else if (valido == ' ') { //evalua el vacio
					throw new ExcepcionBlanco("Se encontro una excepcion de blanco");
				}

				else if (valido == 's' || valido == 'S') { //evalua que sea le caracter de salida s
					throw new ExcepcionSalida("Se encontro una excepcion de salida");
				}

				else if (valido == '1' || valido == '2' || valido == '3' || valido == '4' || valido == '5'
						|| valido == '6' || valido == '7' || valido == '8' || valido == '9' || valido == '0') { //evalua si es un numero
					throw new ExcepcionNumero("Se encontro una excepcion numerica");
				}
			}
			//catch para la excepcion Numerica
			catch (ExcepcionNumero a) {
				System.out.println(a.getMessage());
			} 
			//catch para la excepcion Salida con el caracter salida s
			catch (ExcepcionSalida a) {
				System.out.println(a.getMessage());
				System.out.println("FIN");
				seguir = "no";
			} 
			//catch para la excepcion cuando se envia en blanco
			catch (ExcepcionBlanco a) {
				System.out.println(a.getMessage());
			} 
			
			//catch para la excepcion de caracteres vocales
			catch (ExcepcionVocal a) {
				System.out.println(a.getMessage());
			} 
			
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
