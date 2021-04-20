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

@WebServlet("/PrepareDeleteAbitanteServlet")
public class PrepareDeleteAbitanteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrepareDeleteAbitanteServlet() {
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idAbitanteDaEliminare = request.getParameter("idDaInviareComeParametro");
        try {
            Abitante abitante = MyServiceFactory.getAbitanteServiceInstance().caricaSingoloElemento(Long.valueOf(idAbitanteDaEliminare));
            request.setAttribute("abitante_delete", abitante);
            RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
