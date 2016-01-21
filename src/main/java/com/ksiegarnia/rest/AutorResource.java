package com.ksiegarnia.rest;

import java.util.List;

import com.ksiegarnia.domena.Autor;
import com.ksiegarnia.serwis.AutorManager;

import javax.ejb.EJB;
import javax.ejb.Stateless;
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
@Path("/autor")
public class AutorResource{
    @EJB
    private AutorManager am;

    @GET
    @Path("/dajWszystkie")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Autor> dajAutorow() {
    	 return am.dajWszystkie();
    }

    @POST
    @Path("/dodaj")
    @Produces(MediaType.APPLICATION_JSON)
    public Autor dodaj(
            @FormParam("imie") String imie,
            @FormParam("wzrost") int wzrost,
            @FormParam("ilosck") Integer ilosck)
    {

       Autor autor = new Autor();

        autor.setImie(imie);
        autor.setWzrost(wzrost);
        autor.setIlosck(ilosck);

        am.dodaj(autor);

        return autor;
    }

    @PUT
    @Path("/edytuj/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Autor edytuj(
            @PathParam("id") Long id,
            @FormParam("imie") String imie,
            @FormParam("wzrost") int wzrost,
            @FormParam("ilosck") Integer ilosck)
    {
 	Autor autor = new Autor();

	autor = am.pobierzPoId(id);
	am.edytuj(autor, imie, wzrost, ilosck);

        return autor;
    }

    @DELETE
    @Path("/usun/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void usun(@PathParam("id") long id)
    {
       Autor autor = new Autor();

        am.usun(am.pobierzPoId(id));
    }

    @GET
    @Path("/podglad/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Autor podglad(@PathParam("id") long id) {
    	 return am.pobierzPoId(id);
    }

}
