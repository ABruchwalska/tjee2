package com.ksiegarnia.serwis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ksiegarnia.domena.Autor;

@Stateless
public class AutorManager {

	@PersistenceContext
	EntityManager em;

	public Autor pobierzPoId(Long id) {
		return em.find(Autor.class, id);
	}

	public void dodaj(Autor autor) {
		autor.setId(null);
		em.persist(autor);
        	em.flush();
	}

	public void edytuj(Autor autor, String imie, int wzrost, Integer ilosck) {
		autor = em.find(Autor.class, autor.getId());
		autor.setImie(imie);
		autor.setWzrost(wzrost);
		autor.setIlosck(ilosck);
		em.merge(autor);
	}

	public void usun(Autor autor) {
		autor = em.find(Autor.class, autor.getId());
		em.remove(autor);
	}

	public List<Autor> dajWszystkie() {
		return em.createNamedQuery("autor.wszystkie").getResultList();
	}

	public List<Autor> dajDostepne() {
		return em.createNamedQuery("autor.dostepne").getResultList();
	}
}

