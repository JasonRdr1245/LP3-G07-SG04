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
public class Cuadrado extends FiguraBidimensional {

    private double lado;

    // Constructor

    public Cuadrado(String tipoFiguraBi, String tipoCuerpoBi, double lado) {
        super(tipoFiguraBi, tipoCuerpoBi);
        setLado(lado);
    }
    
    // gets y sets 

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // interfaz 

    @Override
    public double areatotal() {
        return (getLado()* getLado());
    }

    public double volumentotal() {
        return 0;
    }

    // ToString
    @Override
	public String toString() {
		String s;
		s = "\n" +
				"--------------- Datos del " + this.tipoFiguraBi +" ---------------" + "\n" +
				"Tipo de Cuerpo: " + this.tipoCuerpoBi + "\n" +
				"Tipo de Figura: " + this.tipoFiguraBi + "\n" +
				"Area: " + this.areatotal() + "\n";
		return s;
	}

}
