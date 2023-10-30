/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testagreagacion;

public class Automovil {

    // Atributos

    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    // Constructor

    public Automovil(String placa, int numPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters and setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setPlaca(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // toString

    @Override
    public String toString() {
        String s = " ";
        if(getMotor() != null){
            s = "Automovil con motor" + "\n" +
            "Placa: " +this.placa + "\n" +
            "Numero de puertas: " + this.numPuertas + "\n" +
            "Marca del auto: " + this.marca + "\n" +
            "Modelo del auto: " + this.modelo + "\n"+
            this.motor;
        }
        if(getMotor() == null){
            s = "Automovil sin motor" + "\n" +
            "Placa: " +this.placa + "\n" +
            "Numero de puertas: " + this.numPuertas + "\n" +
            "Marca del auto: " + this.marca + "\n" +
            "Modelo del auto: " + this.modelo + "\n";
        }
        return s;
    }
}
