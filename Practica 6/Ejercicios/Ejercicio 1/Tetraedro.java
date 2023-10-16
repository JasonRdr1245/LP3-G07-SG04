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
public class Tetraedro extends FiguraTridimensional {

    private double lado;


    public Tetraedro(String tipoFiguraTri, String tipoCuerpoTri, double lado) {
        super(tipoFiguraTri, tipoCuerpoTri);
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
        return (getLado()* getLado()) * Math.sqrt(3);
    }

    public double volumentotal() {
        return (getLado()* getLado()* getLado()) * (double)(Math.sqrt(2)/12);
    }

    //  ToString 
    @Override
	public String toString() {
		String s;
		s = "\n" +
				"--------------- Datos del " + this.tipoFiguraTri+" ---------------" + "\n" +
				"Tipo de Cuerpo: " + this.tipoCuerpoTri + "\n" +
				"Tipo de Figura: " + this.tipoFiguraTri + "\n" +
				"Area: " + this.areatotal() + "\n"+
                "Volumen: " + this.volumentotal() + "\n";
		return s;
	}

}
