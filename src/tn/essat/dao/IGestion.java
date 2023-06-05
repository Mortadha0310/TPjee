package tn.essat.dao;

import java.util.List;

import tn.essat.model.Livre;
public interface IGestion {
	public List<Livre> getAllLivres();
	public void addLivre(Livre lv);
	public void deleteLivre(int id);

	public Livre getLivreById(int id);
	
	
}
