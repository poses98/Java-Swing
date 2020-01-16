package tema_8;

import java.util.ArrayList;

public class Pais {
	private String nom;
	private ArrayList<String> ciudades;
	public Pais(String nom, ArrayList<String> ciudades) {
		super();
		this.nom = nom;
		this.ciudades = ciudades;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<String> getCiudades() {
		return ciudades;
	}
	public void setCiudades(ArrayList<String> ciudades) {
		this.ciudades = ciudades;
	}
}
