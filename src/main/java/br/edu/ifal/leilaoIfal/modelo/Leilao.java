package br.edu.ifal.leilaoIfal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private List<Lance> lances = new ArrayList();
	
	

	public Leilao() {
		
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}
	
	
}
