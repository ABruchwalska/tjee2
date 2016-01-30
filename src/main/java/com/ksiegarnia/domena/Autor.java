package com.ksiegarnia.domena;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@Entity
@NamedQueries({ 
	@NamedQuery(name = "autor.wszystkie", query = "Select a from Autor a"),
	@NamedQuery(name = "autor.dostepne", query = "Select a from Autor a where a.ilosck > 0 order by a.imie")
})
public class Autor {
	
	private Long id;
	private String imie = "";
	private int wzrost ;
	private Integer ilosck = 0; //ilosc wydanych ksiazek

	private List<Ksiazka> ksiazki = new ArrayList<Ksiazka>();


	public Autor() {
	}

	public Autor(String imie, int wzrost, Integer ilosck) {
	this.imie = imie;
	this.wzrost = wzrost;
	this.ilosck = ilosck;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	@OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	public List<Ksiazka> getKsiazki() {
	return ksiazki;
	}
	public void setKsiazki(List<Ksiazka> ksiazki) {
	this.ksiazki = ksiazki;
	}

	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}

	@Min(0)
	public int getWzrost() {
		return wzrost;
	}
	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}


	@Min(0)
	public Integer getIlosck() {
		return ilosck;
	}

	public void setIlosck(Integer ilosck) {
		this.ilosck = ilosck;
	}
}
