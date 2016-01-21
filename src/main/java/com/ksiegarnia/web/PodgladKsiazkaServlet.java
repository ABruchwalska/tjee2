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

import com.ksiegarnia.serwis.KsiazkaManager;

@WebServlet(urlPatterns = "/PodgladKsiazka/*")
public class PodgladKsiazkaServlet extends HttpServlet{
    @EJB
    private KsiazkaManager km;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String link = request.getPathInfo();
        request.setAttribute("ksiazkaId", link.substring(link.lastIndexOf("/") + 1, link.length()));
        request.getRequestDispatcher("/ksiazki/podglad.jsp").forward(request, response);
    }
}
