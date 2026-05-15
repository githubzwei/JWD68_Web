package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		/*
		 * response.setContentType("text/html"); //Cookie cookie; Cookie[]
		 * ckArray=request.getCookies(); boolean flag = false; int i=0;
		 * if(ckArray!=null) { //for (Cookie cookie : ckArray) {
		 * for(i=0;i<ckArray.length;i++) { if(ckArray[i].getName().equals("ck_name")) {
		 * 
		 * flag=true; break; } } } if(flag) {
		 * pw.print("Welcome ... "+ckArray[i].getValue()); } else {
		 * pw.print("please login first!");
		 * request.getRequestDispatcher("login.jsp").include(request, response); }
		 * 
		 */
		
		if(request.getSession().getAttribute("session")!=null) {
			pw.print("Welcome : "+request.getSession().getAttribute("session"));
		}else {
			pw.print("please login first!");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
