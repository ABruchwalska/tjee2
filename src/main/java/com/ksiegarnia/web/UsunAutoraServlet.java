package com.ksiegarnia.web;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ksiegarnia.domena.Autor;

import com.ksiegarnia.serwis.AutorManager;

@WebServlet(urlPatterns = "/UsunAutora/*")
public class UsunAutoraServlet extends HttpServlet{
    @EJB
    private AutorManager am = new AutorManager();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String link = request.getPathInfo();
        am.usun(am.pobierzPoId(Long.parseLong(link.substring(link.lastIndexOf("/") + 1, link.length()))));
 	response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/Autorzy"));
    }
}
