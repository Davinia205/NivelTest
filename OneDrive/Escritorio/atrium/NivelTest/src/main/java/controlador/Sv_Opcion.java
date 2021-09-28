package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Opciones;
import modelo.Pregunta;

/**
 * Servlet implementation class Sv_Opcion
 */
public class Sv_Opcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sv_Opcion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Pregunta p = new Pregunta();
	    //p.getLastId();
	    int idPreguntas = p.getIdPreguntas();
	    System.out.println(idPreguntas);
		String textoOpcion = request.getParameter("opcion");
		String correcta = request.getParameter("respuesta");
		Opciones o = new Opciones();
		o.setIdPreguntas(idPreguntas);
		o.setTextoOpcion(textoOpcion);
		o.setCorrecta(correcta);
		
		
		try {
		 o.insertar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("registros guardados");
		
		response.sendRedirect("elaboracionTest.jsp");
	}
		
}	


