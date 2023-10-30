/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcomposicion;
import java.util.*;

/**
 *
 * @author user
 */
public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private char tipoCliente;
	private Cuenta cuenta;
	//Constructor
	public Persona(int id, String nombre,String apellido,char tipoCliente) {//Se crea el objeto

		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.tipoCliente=tipoCliente;
		if(tipoCliente=='C')
			this.cuenta=new Cuenta(1000);
		if(tipoCliente=='B')
			this.cuenta=new Cuenta(5000);
		if(tipoCliente=='E')
			this.cuenta=new Cuenta(8000);
	}
	
	public Persona(int id, String nombre,String apellido) {
		this(id,nombre,apellido,'C');
	} 

	public Persona(int id){
		this(id, "", "", 'C');
	}
        //getters and setters
	public char getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(char tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
        //toString
	@Override
	public String toString() {
		return "Cliente :	" + this.id + "\nTipo:	" + this.tipoCliente + "\nNombres :	 " + this.nombre+" " + this.apellido +this.cuenta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return id == other.id;
	}

}
