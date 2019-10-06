package Tema_1;

import java.io.Serializable;
import java.util.ArrayList;

public class Persona_form implements Serializable {
	private String nombre;
	private String apellido;
	private String genero;
	private String pais;
	private String region;
	private ArrayList<String> transporte;
	
	public Persona_form(String nombre, String apellido, String genero, String pais, String region,
			ArrayList<String> transporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.pais = pais;
		this.region = region;
		this.transporte = transporte;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public ArrayList<String> getTransporte() {
		return transporte;
	}

	public void setTransporte(ArrayList<String> transporte) {
		this.transporte = transporte;
	}

	@Override
	public String toString() {
		return "Persona_form [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", pais=" + pais
				+ ", region=" + region + ", transporte=" + transporte + "]";
	}
	
	
	
	
}
