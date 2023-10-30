/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clausulacatch;

public class ClausulaCatch {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Resultado de la división: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Se produjo una excepción de división por cero: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Se produjo una excepción de formato numérico: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se produjo una excepción general: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return a / b;
    }
}

