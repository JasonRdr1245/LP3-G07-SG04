/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioecologico;

/**
 *
 * @author user
 */
public class EjercicioEcologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImpactoEcologico[] ObjetosImpacto = new ImpactoEcologico[3];

        ObjetosImpacto[0] = new Auto("Automovil", 200, 50, 26.4979);
        ObjetosImpacto[1] = new Edificio("Edificio", 30, 70, 35);
        ObjetosImpacto[2] = new Bicicleta("Biclicleta", 0, 20, 100);

        System.out.println("Objetos junto a su impacto Ambiental procesados de forma Polimorfica: \n");

        for(ImpactoEcologico ObjetosActuales : ObjetosImpacto) 
        {
            System.out.printf( ObjetosActuales.toString());
        }
    }
    }
    
