package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Connectiontoken;
import models.Usuario;
import services.ConnectiontokenDao;
import services.UsuarioDao;

/**
 * Servlet implementation class TokenController
 */
@WebServlet("/TokenController")
public class TokenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final UsuarioDao usuarioDao;
	
	private final ConnectiontokenDao tokenDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TokenController() {
        super();
        this.usuarioDao = new UsuarioDao();
        this.tokenDao = new ConnectiontokenDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Usuario> usuarios = usuarioDao.list();
		request.setAttribute("usuarios", usuarios);
		
		request.getRequestDispatcher("registroToken.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String host = request.getParameter("host");
		String userDb = request.getParameter("userDb");
		String pass = request.getParameter("pass");
		String db = request.getParameter("db");
		String token = request.getParameter("token");
		String usuario = request.getParameter("usuario");
		String state = request.getParameter("state");
		String type = request.getParameter("type");
		
		
		Connectiontoken t = new Connectiontoken();
				
				
		tokenDao.insert(t);
		
		
		doGet(request, response);
	}

}
