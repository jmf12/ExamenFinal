package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Typedb;
import services.TypedbDao;

/**
 * Servlet implementation class TiposDb
 */
@WebServlet("/TiposDbController")
public class TiposDbController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private TypedbDao typedbDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TiposDbController() {
        super();

        this.typedbDao = new TypedbDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("registroTypes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String descripcion = request.getParameter("descripcion");
		String driver = request.getParameter("driver");
		String adicional = request.getParameter("adicional");
		
		Typedb tdb = new Typedb();
		
		tdb.setId(id);
		tdb.setDescription(descripcion);
		tdb.setDriver(driver);
		tdb.setAditional(adicional);
		
		typedbDao.insert(tdb);
		
		
		doGet(request, response);
	}

}
