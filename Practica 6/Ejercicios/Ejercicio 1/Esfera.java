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
public class Esfera extends FiguraTridimensional {

    private double radio;

    // Constructor

    public Esfera(String tipoFiguraTri, String tipoCuerpoTri, double radio) {
        super(tipoFiguraTri, tipoCuerpoTri);
        setRadio(radio);
    }
    
    // gets y sets

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // interfaz 

    @Override
    public double areatotal() {
        return 4 * (3.1416 * (getRadio()* getRadio()));
    }

    public double volumentotal() {
        return (4/3) * (3.1416 * (getRadio()* getRadio()));
    }

    // ToString
    @Override
	public String toString() {
		String s;
		s = "\n" +
        "--------------- Datos de la " + this.tipoFiguraTri +" ---------------" + "\n" +
				"Tipo de Cuerpo: " + this.tipoCuerpoTri + "\n" +
				"Tipo de Figura: " + this.tipoFiguraTri + "\n" +
				"Area: " + this.areatotal() + "\n"+
                "Volumen: " + this.volumentotal() + "\n";
		return s;
	}

}
