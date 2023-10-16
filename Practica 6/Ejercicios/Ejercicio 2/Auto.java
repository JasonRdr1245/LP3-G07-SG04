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
public class Auto implements ImpactoEcologico {

    String TipoAuto;
    double EmisionCo2;
    double Aceleracion;
    double Gasolina;
    double factor_emision = 0.3;

    // Constructor

    public Auto(String Auto, double Emision, double Aceleracionto, double Gas) {
        TipoAuto = Auto;
        EmisionCo2 = Emision;
        Aceleracion = Aceleracionto;
        Gasolina = Gas;
    }

    // Getters and setters

    public String getTipoAuto() {
        return TipoAuto;
    }

    public double getEmisionCo2() {
        return EmisionCo2;
    }

    public double getAceleracion() {
        return Aceleracion;
    }

    public double getGasolina() {
        return Gasolina;
    }

    public void setTipoAuto(String Auto) {
        TipoAuto = Auto;
    }

    public void setEmisionCo2(double Emision) {
        EmisionCo2 = Emision;
    }

    public void setAceleracion(double Aceleracionto) {
        Aceleracion = Aceleracionto;
    }

    public void setGasolina(double Gas) {
        Gasolina = Gas;
    }


    public double Dato_actividad(){
        double Emisioncompleta;
        Emisioncompleta = getAceleracion()/getGasolina();
        setEmisionCo2(Emisioncompleta);
        return getEmisionCo2();
    }

    // interfaz

    @Override
    public double ObtenerImpactoEcologico() {
        return Dato_actividad() * factor_emision;
    }

    //  ToString

    @Override
    public String toString() {
        String s;
        s = "\n" +
                "--------------- Datos Ecologicos del "+ this.TipoAuto +" ---------------" + "\n" +
                "Categoria Contaminante: " + this.TipoAuto+ "\n" +
                "Emision de Carbono del "+ this.TipoAuto + ": " + this.EmisionCo2 + "\n"+
                "Aceleracion minima: " + this.Aceleracion + "\n" +
                "Gasolina depositada: " + this.Gasolina+ "\n" +
                "Impacto Ecologico: " + this.ObtenerImpactoEcologico() +" GEI" + "\n";
        return s;
    }
}
