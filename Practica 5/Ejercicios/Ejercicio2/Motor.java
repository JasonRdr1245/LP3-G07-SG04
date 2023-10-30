/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testagreagacion;

/**
 *
 * @author user
 */
public class Motor {

    // Atributos

    private int numMotor;
    private int revPorMin;

    // Constructor

    public Motor(int numMotor, int revPorMin) {
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }

    // Getters and setters

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getRevPorMin() {
        return revPorMin;
    }

    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }

    // toString

    @Override
    public String toString() {
        String s = "Numero de motor: " +this.numMotor + "\n" +
        "R.V.P: " + this.revPorMin + "\n";
        return s;
    }
}
