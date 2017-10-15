package com.gamebook.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Logica.Fabrica;
import dataTypes.TRetorno;

/**
 * Servlet implementation class ConsultaPropuesta
 */
@WebServlet("/ConsultaPropuesta")
public class ConsultaPropuesta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaPropuesta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String propuesta = request.getParameter("propuesta");
		System.out.println(propuesta);
		try {
			String titulo = Fabrica.getInstance().getICtrlPropuesta().infoPropuesta(propuesta).getTitulo();
			String descripcion = Fabrica.getInstance().getICtrlPropuesta().infoPropuesta(propuesta).getDescripcion();
			String lugar = Fabrica.getInstance().getICtrlPropuesta().infoPropuesta(propuesta).getLugar();
			Date fechaPrevista = Fabrica.getInstance().getICtrlPropuesta().infoPropuesta(propuesta).getFechaRealizacion();
			float precioEntrada = Fabrica.getInstance().getICtrlPropuesta().infoPropuesta(propuesta).getPrecioEntrada();
			float montoNecesario = Fabrica.getInstance().getICtrlPropuesta().infoPropuesta(propuesta).getMontoReunir();
			TRetorno tRetorno = Fabrica.getInstance().getICtrlPropuesta().infoPropuesta(propuesta).getTipoRetorno();
			
			request.setAttribute("titulo", titulo);
			request.setAttribute("desc", descripcion);
			request.setAttribute("lugar", lugar);
			request.setAttribute("fechaPrevista", fechaPrevista);
			request.setAttribute("precioEntrada", precioEntrada);
			request.setAttribute("montoNecesario", montoNecesario);
			request.setAttribute("tipoRetorno", tRetorno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/WEB-INF/propuestas/consultaPropuesta.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}