/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofigura;

/**
 *
 * @author user
 */
public class EjercicioFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Figura[] FigurasGeometricas = new Figura[6];
        int countBi = 0;
        int countTri = 0;

        FigurasGeometricas[0] = new Circulo( "Circulo", "Figura Bidimensional", 4);
        FigurasGeometricas[1] = new Cuadrado("Cuadrado", "Figura Bidimensional", 12);
        FigurasGeometricas[2] = new Triangulo("Triangulo", "Figura Bidimensional", 7, 9);
        FigurasGeometricas[3] = new Esfera("Esfera", "Figura Tridimensional", 15);
        FigurasGeometricas[4] = new Cubo("Cubo", "Figura Tridimensional", 22);
        FigurasGeometricas[5] = new Tetraedro("Tetraedro", "Figura Tridimensional", 10);

        System.out.println("Figuras Geometricas procesadas de forma Polimorfica: \n");

        for(Figura FigurasActuales : FigurasGeometricas) 
        {
            System.out.printf( FigurasActuales.toString());

            if(FigurasActuales instanceof FiguraBidimensional){
                countBi++;
            }

            if(FigurasActuales instanceof FiguraTridimensional){
                countTri++;
            }
        }
        System.out.println("\nEn el arreglo de Figuras Geometricas hay: "+ countBi +" Figuras Geometricas Bidimensionales");
        System.out.println("En el arreglo de Figuras Geometricas hay: "+ countTri +" Figuras Geometricas Tridimensionales");
    }
}
 
   
