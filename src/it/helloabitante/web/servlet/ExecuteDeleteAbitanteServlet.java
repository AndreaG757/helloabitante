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
import it.helloabitante.service.abitante.AbitanteService;

@WebServlet("/ExecuteDeleteAbitanteServlet")
public class ExecuteDeleteAbitanteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public ExecuteDeleteAbitanteServlet() {
		
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idAbitante = request.getParameter("idDeleteInput");

        try {
            Abitante abitante = MyServiceFactory.getAbitanteServiceInstance().caricaSingoloElemento(Long.parseLong(idAbitante));
            MyServiceFactory.getAbitanteServiceInstance().rimuovi(abitante);
        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestDispatcher rd = request.getRequestDispatcher("searchForm.jsp");
        rd.forward(request, response);
    }

}
