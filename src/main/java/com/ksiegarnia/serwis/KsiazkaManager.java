package com.ksiegarnia.serwis;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ksiegarnia.domena.Ksiazka;
import com.ksiegarnia.domena.Autor;

@Stateless
public class KsiazkaManager {

	@PersistenceContext
	EntityManager em;

	public Ksiazka pobierzPoId(Long id) {
		return em.find(Ksiazka.class, id);
	}

	public void dodaj(Ksiazka ksiazka) {
		ksiazka.setId(null);
		em.persist(ksiazka);
		Autor autor = em.find(Autor.class, ksiazka.getAutor().getId());
		autor.setIlosck(autor.getIlosck()-1);
		em.merge(autor);
	}

	public void edytuj(Ksiazka ksiazka, Date datawyd, Autor autor, Double cena, String opis) {
		ksiazka = em.find(Ksiazka.class, ksiazka.getId());
		Autor au = em.find(Autor.class, ksiazka.getAutor().getId());
		ksiazka.setAutor(autor);
		ksiazka.setDatawyd(datawyd);
		ksiazka.setCena(cena);
		ksiazka.setOpis(opis);
		em.merge(ksiazka);
		au.setIlosck(au.getIlosck()+1);
		em.merge(au);
		autor.setIlosck(autor.getIlosck()-1);
		em.merge(autor);
	}

	public void usun(Ksiazka ksiazka) {
		ksiazka = em.find(Ksiazka.class, ksiazka.getId());
		Autor au = em.find(Autor.class, ksiazka.getAutor().getId());
		//au.getKsiazka().remove(ksiazka);
		em.remove(ksiazka);
		au.setIlosck(au.getIlosck()+1);
		em.merge(au);
	}

	public List<Ksiazka> dajWszystkie() {
		return em.createNamedQuery("ksiazka.wszystkie").getResultList();
	}

}

