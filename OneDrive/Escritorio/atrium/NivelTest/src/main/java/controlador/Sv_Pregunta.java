package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoPregunta;
import modelo.Opciones;
import modelo.Pregunta;

/**
 * Servlet implementation class Sv_Pregunta
 */
@WebServlet("/Sv_libreria")
public class Sv_Pregunta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sv_Pregunta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String texto = request.getParameter("texto");
		int puntuacion = Integer.parseInt(request.getParameter("puntuacion"));
		Pregunta p = new Pregunta();
        p.setTexto(texto);
        p.setPuntuacion(puntuacion);
        System.out.println(p);
        
        String textoOpcion = request.getParameter("opcion");
		String correcta = request.getParameter("respuesta");
		Opciones o = new Opciones();
		o.setTextoOpcion(textoOpcion);
		o.setCorrecta(correcta);
        System.out.println(o);

		try {
			p.insertar(o);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("registro guardado");
		
				
		response.sendRedirect("elaboracionOpciones.jsp");
	}

}
