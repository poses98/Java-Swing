package tema_8;

import java.util.ArrayList;
import java.util.Arrays;

public class PaisesGestor {
	private ArrayList<Continente> continentes;

	public PaisesGestor() {
		continentes = new ArrayList<Continente>();
		AddEuropa();
		AddAsia();
	}
	
	private void AddEuropa() {
		Continente cont = new Continente("Europa");
		ArrayList<Pais> paises = new ArrayList<Pais>();
		paises.add(new Pais("España",new ArrayList<String>(Arrays.asList("Madrid",
				"Barcelona","Pamplona","Donosti","Bilbao","Vitoria","Santander","Logroño","Jaca"))));
		paises.add(new Pais("Francia",new ArrayList<String>(Arrays.asList("Burdeos",
				"Paris","Marsella","Lyon","Toulouse","Niza","Nantes","Estrasburgo","Montpellier"))));
		paises.add(new Pais("Holanda",new ArrayList<String>(Arrays.asList("Ámsterdam",
				"Rotterdam","Delft","Gouda","Utrecht","Maastricht","Eindhoven","Groningen","Deventer"))));
		paises.add(new Pais("Alemania",new ArrayList<String>(Arrays.asList("Berlín",
				"Múnich","Frankfurt","Hamburgo","Colonia","Stuttgart ","Núremberg"))));
		cont.setPaises(paises);
		
		continentes.add(cont);
	}
	private void AddAsia() {
		Continente cont = new Continente("Asia");
		ArrayList<Pais> paises = new ArrayList<Pais>();
		paises.add(new Pais("China",new ArrayList<String>(Arrays.asList("Shanghái",
				"Pekín","Cantón","Shenzhen","Tianjin","Chongqing","Hong Kong","Dongguan","Nankín"))));
		paises.add(new Pais("Japón",new ArrayList<String>(Arrays.asList("Oita",
				"Hiroshima","Kōbe","Kioto","Nagasaki","Nagoya","Osaka","Sapporo"))));
		paises.add(new Pais("Corea",new ArrayList<String>(Arrays.asList("Seúl",
				"Busan","Incheon","Daegu","Daejeon","Gwangju","Suwon","Ulsan"))));
		cont.setPaises(paises);
		continentes.add(cont);
	}
	
	public String[] getContinentes(){
		String[] contArr = new String[2];
		int i = 0;
		for(Continente cont : continentes) {
			contArr[i] =  cont.getNom();
			i++;
		}
		
		return contArr;
	}
	
	public String[] getPaises(int n){
		String[] paisArr = new String[continentes.get(n).getPaises().size()];
		int i = 0;
		for(Pais pais : continentes.get(n).getPaises()) {
			paisArr[i] =  pais.getNom();
			i++;
		}
		
		return paisArr;
	}
	
	public String[] getCiudades(int n,int x) {
		String[] ciuArr = new String[continentes.get(n).getPaises().get(x).getCiudades().size()];
		int i = 0;
		for(String ciu : continentes.get(n).getPaises().get(x).getCiudades()) {
			ciuArr[i] =  ciu;
			i++;
		}
		return ciuArr;
	}
}
