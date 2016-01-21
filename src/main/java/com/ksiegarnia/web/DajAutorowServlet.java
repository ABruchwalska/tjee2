package com.ksiegarnia.web;

import com.ksiazka.serwis.AutorManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Autorzy")
public class DajAutorowServlet extends HttpServlet{
    @EJB
    private AutorManager am;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setAttribute("autorzy", am.dajWszystkie());
        request.getRequestDispatcher("dane/autorzy.jsp").forward(request, response);
    }
}
