package com.ksiegarnia.domena;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "ksiazka.wszystkie", query = "Select k from Ksiazka k")
})
public class Ksiazka {

	private Long id;
 	private Ksiazka ksiazka;
	private Date datawyd = new Date();
	private Double cena = 0.0;
	private String opis = "";

	 public Ksiazka() {
	}

	public Ksiazka(Autor autor, Date datawyd, Double cena, String opis)
	{
	this.autor = autor;
	this.datawyd = datawyd;
	this.cena = cena;
	this.opis = opis;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "id_autor", nullable = false)
	public Autor getAutor() {
	return autor;
	}
	public void setAutor(Autor autor) { this.autor = autor; }
	
	@Temporal(TemporalType.DATE)
	public Date getDatawyd() {
		return datawyd;
	}
	public void setDatawyd(Date datawyd) {
		this.datawyd = datawyd;
	}

	@Min(0)
	public Double getCena() {
		return cena;
	}
	public void setCena(Double cena) {
		this.cena = cena;
	}

	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
}
