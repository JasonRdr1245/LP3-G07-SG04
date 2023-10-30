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
public class Persona {

    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

    // Constructor

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        // determine el numero de cuenta a traves del id
        this.cuenta = new Cuenta(id); // Relacion de composicion

    }

    // getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    // toString

    @Override
    public String toString() {
        String s = String.format("%10s%2s %10s%2s %10s", this.nombre, "|", this.apellido, "|", this.id);
        return s;
    }

}
