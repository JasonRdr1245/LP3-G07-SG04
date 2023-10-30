import java.util.Scanner;

public class App {
    public static int cociente(int numeracion,int denominador){
        return numerador/denominador;
    }
    public static void main(String[] args) throws Exception {
        Scanner explorador=new Scanner(System.in);
        boolean flag=true;
        System.out.println("Introduzca un numero entero");
        int numerador=explorador.nextInt();
        System.out.println("Introduzca un denominador entero");
        int denominador=explorador.nextInt();
        int resultado=cociente(numerador, denominador);
        System.out.printf("\nResultado; %d / %d = %d \n",numerador,denominador,resultado);
        //podria ocurrir un error de division sobre 0, ese error se lanza al denominador ser 0;
        //el otro error se da al no leer enteros como se tenia planeqado ya que se supone que se deben leer enteros
    }
}

