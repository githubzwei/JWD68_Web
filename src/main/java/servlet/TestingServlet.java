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
 * Servlet implementation class TestServlet
 */
@WebServlet("/testing")
public class TestingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestingServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("code added by GitHubZwei");
		String name = request.getParameter("username");

		PrintWriter pw = response.getWriter();
		pw.print("doGet - Name : " + name);
		
		String id = request.getParameter("id");
		String value = request.getParameter("value");
		
		System.out.println("id : "+(id != null));
		System.out.println("value : "+(value != null));

		if (id != null && value != null) {
			int idValue = Integer.parseInt(id);
			pw.print("id :" + idValue + "\nvalue :" + value);
		}
		
		
		/*
		 * if(id!=null) { int idValue = Integer.parseInt(id); pw.print("id : "+idValue);
		 * }
		 * 
		 * 
		 * if(value!=null) { pw.print("value : "+value); }
		 */
		
		ServletConfig config = getServletConfig();
		String language =config.getInitParameter("language");
		pw.print("\nLanguage : "+language);
		
		
		ServletContext context = getServletContext();
		String country = context.getInitParameter("country");
		pw.print("\nCountry : "+country);
		
		pw.print("<p style='color:red;'>Test</p>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//try {
			
			PrintWriter pw = response.getWriter();
			
			String name = request.getParameter("username");
			String[]classes =request.getParameterValues("classes");
			
			if(classes!=null) {
				for (String c : classes) {
					pw.println(c);
				}	
			}
			
					
			pw.print("doPost - Name : " + name);
			
			
			/*
			 * }catch (NullPointerException e) {
			 * System.out.println("error : "+e.getMessage()); }
			 */
		
		
	}

}
