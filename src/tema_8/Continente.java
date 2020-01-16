package tema_8;

import java.util.ArrayList;

public class Continente {
	private String nom;
	private ArrayList<Pais> paises;
	public Continente(String nom) {
		super();
		this.nom = nom;
		this.paises = new ArrayList<Pais>();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Pais> getPaises() {
		return paises;
	}
	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}
	
	
}
