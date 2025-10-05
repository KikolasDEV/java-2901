package com.ipartek.formacion.citas.presentacion.controladores;

import java.io.IOException;
import java.time.LocalDateTime;

import com.ipartek.bibliotecas.Fabrica;
import com.ipartek.citas.accesodatos.DaoCita;
import com.ipartek.citas.entidades.Cita;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/citas/listado")
public class ListadoControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Extraer información de la petición
		// Convertir la información recibida
		// Empaquetar en objetos
		// Ejecturar lógica de negocio
		var dao = (DaoCita) Fabrica.obtenerObjeto("dao.cita");
		
		var citas = dao.obtenerTodos();
		
		// Empaquetar objetos para la siguiente vista
		request.setAttribute("citas", citas);
		
		// Mostrar la siguiente vista
		request.getRequestDispatcher("/WEB-INF/vistas/listado.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Extraer información de la petición
		var texto = request.getParameter("texto");
		var sInicio = request.getParameter("inicio");
		var sFin = request.getParameter("fin");
		
		// Convertir la información recibida
		var inicio = LocalDateTime.parse(sInicio);
		var fin = LocalDateTime.parse(sFin);
		
		// Empaquetar en objetos
		var cita = new Cita(texto, inicio, fin);
		
		// Ejecturar lógica de negocio
		var dao = (DaoCita) Fabrica.obtenerObjeto("dao.cita");
		
		dao.insertar(cita);
		
		// Empaquetar objetos para la siguiente vista
		// Mostrar la siguiente vista
		response.sendRedirect("listado");
		
	}
}
