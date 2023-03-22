package it.polito.tdp.corsi.model;

import java.util.*;

import it.polito.tdp.db.CorsoDAO;

public class Model {
	
	private CorsoDAO corsoDAO;
	
	public Model() {
		this.corsoDAO = new CorsoDAO();
	}

	public List<Corso> getCorsiSemestre(int periodo){
		return corsoDAO.getCorsiSemestre(periodo);
	}
	
	public Map<Corso, Integer> getIscrittiCorsoPeriodo(int periodo){
		return this.corsoDAO.getIscrittiCorsoPeriodo(periodo);
	}
}
