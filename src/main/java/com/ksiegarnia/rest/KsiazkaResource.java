package com.ksiegarnia.rest;

import java.util.List;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.ksiegarnia.domena.Ksiazka;
import com.ksiegarnia.domena.Autor;
import com.ksiegarnia.serwis.KsiazkaManager;
import com.ksiegarnia.serwis.AutorManager;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServlet;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.PUT;


@Stateless
@Path("/ksiazka")
public class KsiazkaResource{
    @EJB
    private KsiazkaManager km;
    @EJB
    private AutorManager am;

    @GET
    @Path("/dajWszystkie")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ksiazka> dajKsiazki() {
    	 return km.dajWszystkie();
    }

    @POST
    @Path("/dodaj")
    @Produces(MediaType.APPLICATION_JSON)
    public Ksiazka dodaj(
            @FormParam("datawyd") String datawyd, //?
            @FormParam("autor") Long autor,
            @FormParam("cena") Double cena,
	    @FormParam("opis") String opis)
    {
	Ksiazka ksiazka = new Ksiazka();

	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	try
	{
		ksiazka.setDatawyd(format.parse(datawyd));
	}
	catch(Exception e)
	{
	}
	ksiazka.setAutor(am.pobierzPoId(autor));
	ksiazka.setCena(cena);
	ksiazka.setOpis(opis);

	km.dodaj(ksiazka);

       return ksiazka;
    }

    @PUT
    @Path("/edytuj/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ksiazka edytuj(
            @PathParam("id") Long id,
            @FormParam("datawyd") String datawyd,
            @FormParam("autor") Long autor,
            @FormParam("cena") Double cena,
	    @FormParam("opis") String opis)
    {
	Ksiazka ksiazka = new Ksiazka();

	ksiazka = km.pobierzPoId(id);
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	try
	{
		km.edytuj(ksiazka, format.parse(datawyd), am.pobierzPoId(autor), cena, opis);
	}
	catch(Exception e)
	{
	}

       return ksiazka;
    }

    @DELETE
    @Path("/usun/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void usun(@PathParam("id") long id)
    {
        Ksiazka ksiazka = new Ksiazka();

        km.usun(km.pobierzPoId(id));
    }

    @GET
    @Path("/podglad/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ksiazka podglad(@PathParam("id") long id) {
    	 return km.pobierzPoId(id);
    }

}
