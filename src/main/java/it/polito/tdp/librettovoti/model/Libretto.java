package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti;

	public Libretto() {
		this.voti = new ArrayList<Voto>();;
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public String toString() {
		String s = "";
		
		for(Voto v : this.voti)
			s += v.toString();
		
		return s;
		
	}
	
	public void stampaVotiUguali(int punteggio) {
		//il libretto stempa da solo i voti
		System.out.println();
		
	}
	
	//public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti
		//sta poi al chiamante a stamparli
	// }
	
	public List<Voto> listaVotiUguali(int punteggio) {
		
		ArrayList<Voto> ll = new ArrayList<Voto>();
		
		for(Voto v : this.voti)
			if(v.getVoto() == punteggio)
				ll.add(v);
		
		return ll;
		
	}
	
	public Libretto votiUguali(int punteggio) {
		
		Libretto risultato = new Libretto();
	
		for(Voto v : this.voti)
		   if(v.getVoto() == punteggio)
	          risultato.add(v);
	
	    return risultato;
		
	}
	
	

}
