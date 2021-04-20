package it.helloabitante.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.helloabitante.model.Abitante;
import it.helloabitante.service.MyServiceFactory;

@WebServlet("/ExecuteInsertAbitanteServlet")
public class ExecuteInsertAbitanteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ExecuteInsertAbitanteServlet() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeParameter = request.getParameter("nomeInsertInput");
		String cognomeParameter = request.getParameter("cognomeInsertInput");
		String codiceFiscaleParameter = request.getParameter("codiceFiscaleInsertInput");
		String etaParameter = request.getParameter("etaInsertInput");
		String mottoParameter = request.getParameter("mottoInsertInput");
		
		RequestDispatcher rd = null;
		
		if (nomeParameter != null && !nomeParameter.isEmpty() &&
			cognomeParameter != null && !cognomeParameter.isEmpty() && codiceFiscaleParameter != null && 
			!codiceFiscaleParameter.isEmpty() && etaParameter != null && !etaParameter.isEmpty() && 
			etaParameter.matches("[0-9]+") && mottoParameter != null && !mottoParameter.isEmpty()) {
			
			Abitante abitante = new Abitante(nomeParameter, cognomeParameter, codiceFiscaleParameter, Integer.parseInt(etaParameter), mottoParameter);
			
			try {
				MyServiceFactory.getAbitanteServiceInstance().inserisciNuovo(abitante);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			rd = request.getRequestDispatcher("searchForm.jsp");
		} else {
			request.setAttribute("errore_attribute", "Hai inserito dei valori errati, riprova.");
			rd = request.getRequestDispatcher("insert.jsp");
		}
		
		rd.forward(request, response);
	}

}
