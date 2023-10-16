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
public class Circulo extends FiguraBidimensional {

    private double radio;

    // Constructor

    public Circulo(String tipoFiguraBi, String tipoCuerpoBi, double radio) {
        super(tipoFiguraBi, tipoCuerpoBi);
        setRadio(radio);
    }
    
    // gets y sets

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //  interfaz

    @Override
    public double areatotal() {
        return 3.1416 * (getRadio()* getRadio());
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
