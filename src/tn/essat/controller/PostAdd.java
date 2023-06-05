package tn.essat.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.dao.IGestion;
import tn.essat.model.Livre;

/**
 * Servlet implementation class PostAdd
 */
public class PostAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IGestion gestion= new GestionImp();
		String Titre=request.getParameter("titre");
		String Prix=request.getParameter("qte");
		String Qte=request.getParameter("prix");
		
		
		
		Livre lv= new Livre();
		lv.setPrix(Prix);
		lv.setQte(Qte);
		lv.setTitre(Titre);
		
		gestion.addLivre(lv);
		
		request.getRequestDispatcher("Principale").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
