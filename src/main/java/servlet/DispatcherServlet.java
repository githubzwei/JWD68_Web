package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/dispatcher")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		ServletConfig config = getServletConfig();
		String language =config.getInitParameter("language");
		pw.print("\nLanguage : "+language);
		
		
		ServletContext context = getServletContext();
		String country = context.getInitParameter("country");
		pw.print("\nCountry : "+country);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("uname");
		String password = request.getParameter("upass");
		
		if(password.equals("123")) {
			request.getRequestDispatcher("welcome.html").include(request, response);
			pw.print(name);
		}else {
			//request.getRequestDispatcher("error.html").forward(request, response);
			response.sendRedirect("error.html");
		}
		
	}

}
