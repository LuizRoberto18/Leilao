package br.edu.ifal.leilaoIfal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private List<Lance> lances = new ArrayList<Lance>();
	


	public Leilao() {
		super();
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		this.lances.add(lance);
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}
	
	
}
