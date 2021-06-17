package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.ConnectiontokenDao;

/**
 * Servlet implementation class ActualizarTokenController
 */
@WebServlet("/ActualizarTokenController")
public class ActualizarTokenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final ConnectiontokenDao tokenDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarTokenController() {
        super();
        this.tokenDao = new ConnectiontokenDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idToken = request.getParameter("idToken");
		tokenDao.find(idToken);
		request.getRequestDispatcher("registroToken.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
