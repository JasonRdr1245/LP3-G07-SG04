/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testagregacion;

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

    // getters and setters

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
        String s = String.format("%10s%2s %10s%2s", this.numMotor, "|", this.revPorMin);
        return s;
    }
}
