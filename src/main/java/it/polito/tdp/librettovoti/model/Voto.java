package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;


//plain old java object   pojo

/**
 * Memorizza il risultato di un esame singolo
 * @author lisat
 *
 */
public class Voto {
	
	private String nome;
	private int voto;
	private LocalDate data;
	

	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public int getVoto() {
		return voto;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Voto : nome = "+ this.nome + ", voto = " +this.voto + ", data = " + this.data+"\n";
	}
	
	
	
	
	
	

}
