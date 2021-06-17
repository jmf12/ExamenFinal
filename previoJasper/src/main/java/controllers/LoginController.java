package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import services.UsuarioDao;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final UsuarioDao usuarioDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
       this.usuarioDao = new UsuarioDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario =request.getParameter("usuario");
		String password = request.getParameter("pass");
		
		
		String rta = usuarioDao.iniciarSesion(usuario, password);
		
		if(rta.equalsIgnoreCase("SUCCESS")){
			HttpSession session = request.getSession();
			session.setAttribute("usuario",usuarioDao.find(usuario));
			
			System.out.println("Todo Correcto!!");
			
			response.sendRedirect("/RegistroController");
			
		}else{
			
			response.setContentType("text/plain");
			PrintWriter out = response.getWriter();
			out.print(rta);
			
			System.out.println("Algo estuvo mal!!");
		}
		
		
		
	}

}
