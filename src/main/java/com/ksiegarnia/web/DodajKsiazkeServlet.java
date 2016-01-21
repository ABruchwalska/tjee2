package com.ksiegarnia.web;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ksiegarnia.domena.Ksiazka;
import com.ksiegarnia.domena.Autor;

import com.ksiegarnia.serwis.KsiazkaManager;
import com.ksiegarnia.serwis.AutorManager;

@WebServlet(urlPatterns = "/DodajKsiazke")
public class DodajKsiazkeServlet extends HttpServlet{
    @EJB
    private KsiazkaManager km;
    @EJB
    private AutorManager am;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("autorzyDostepni", am.dajDostepne());
        request.getRequestDispatcher("/ksiazki/dodaj.jsp").forward(request, response);
    }

}
