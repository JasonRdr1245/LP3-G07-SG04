/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcomposicio;

/**
 *
 * @author user
 */
public class Cuenta {

    // Atributos
    private int numero;
    private double saldo;

    // Constructor

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cuenta(int numero) {
        this(numero, 0);
    }

    // getters y setters

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // toString

    @Override
    public String toString() {
        String s = String.format("%10s%2s %10s%2s", this.numero, "|", this.saldo);
        return s;
    }

}
