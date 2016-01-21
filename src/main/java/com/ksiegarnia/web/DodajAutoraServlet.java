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

@WebServlet(urlPatterns = "/DodajAutora")
public class DodajAutoraServlet extends HttpServlet{
    @EJB
    private AutorManager am = new AutorManager();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/autorzy/dodaj.jsp").forward(request, response);
    }
}
