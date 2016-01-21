package com.ksiegarnia.web;

import com.ksiegarnia.serwis.KsiazkaManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Ksiazki")
public class DajKsiazkiServlet extends HttpServlet{
    @EJB
    private KsiazkaManager km;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setAttribute("ksiazki", km.dajWszystkie());
        request.getRequestDispatcher("dane/ksiazki.jsp").forward(request, response);
    }
}
