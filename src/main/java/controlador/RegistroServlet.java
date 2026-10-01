package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String buscar = request.getParameter("buscar");
		response.getWriter().println("Buscando " + buscar);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTf-8");
		String usuario = request.getParameter("usuario");
		request.setAttribute("usuario", usuario);
		String correo = request.getParameter("correo");
		request.setAttribute("correo", correo);
		String genero = request.getParameter("genero");	
		request.setAttribute("genero", genero);
		String fecha  = request.getParameter("fecha");
		request.setAttribute("fecha", fecha);
		request.getRequestDispatcher("Resultado.jsp").forward(request, response);
				}

}
