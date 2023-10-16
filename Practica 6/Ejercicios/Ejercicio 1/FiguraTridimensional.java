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
public abstract class FiguraTridimensional implements Figura{

    public String tipoFiguraTri;
    public String tipoCuerpoTri;

    // -------------Constructor----------------------
    
    public FiguraTridimensional(String FiguraTri, String CuerpoTri) {
        tipoFiguraTri = FiguraTri;
        tipoCuerpoTri = CuerpoTri;
    }

    // ----------------gets y sets ----------------------

    public String getTipoFiguraTri() {
        return tipoFiguraTri;
    }

    public String getTipoCuerpoTri() {
        return tipoCuerpoTri;
    }

    public void setTipoFiguraTri(String tipoFiguraTri) {
        this.tipoFiguraTri = tipoFiguraTri;
    }

    public void setTipoCuerpoTri(String tipoCuerpoTri) {
        this.tipoCuerpoTri = tipoCuerpoTri;
    }

}
