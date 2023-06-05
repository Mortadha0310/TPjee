package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity

public class Livre {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Titre;
	private String Prix;
	private String Qte;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String Titre) {
		this.Titre = Titre;
	}

	public String getPrix() {
		return Prix;
	}

	public void setPrix(String Prix) {
		this.Prix = Prix;
	}

	public String getQte() {
		return Qte;
	}

	public void setQte(String Qte) {
		this.Qte = Qte;
	}

	public Livre(int id, String Titre, String Prix, String Qte) {
		super();
		this.id = id;
		this.Titre =Titre;
		this.Prix = Prix;
		this.Qte = Qte;
	}

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}