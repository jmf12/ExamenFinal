package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Rol;
import models.Usuario;
import services.RolDao;
import services.UsuarioDao;

/**
 * Servlet implementation class RegistroController
 */
@WebServlet("/RegistroController")
public class RegistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final UsuarioDao usuarioDao;
	
	private final RolDao rolDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistroController() {
		super();
		this.usuarioDao = new UsuarioDao();
		this.rolDao = new RolDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Rol> roles = rolDao.list();
		request.setAttribute("roles", roles);

		request.getRequestDispatcher("registro.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		int rol = Integer.parseInt(request.getParameter("rol"));
		short state = 0;
		
		Rol r = new RolDao().find(rol);
		
		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setEmail(email);
		u.setPass(pass);
		u.setRol(r);
		u.setState(state);
		
		usuarioDao.insert(u);
		
		doGet(request, response);
		
	}
	

}
