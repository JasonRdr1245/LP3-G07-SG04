/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asercionejemplo;


public class AsercionEjemplo {
    public static double divide(double numerator, double denominator) {
        assert denominator != 0 : "El denominador no puede ser cero";
        if (denominator == 0) {
            throw new IllegalArgumentException("División por cero no permitida");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        double numerator = 10.0;
        double denominator = 0.0;

        try {
            double result = divide(numerator, denominator);
            System.out.println("Resultado de la división: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}

