package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

/**
 * Servlet implementation class ELServlet
 */
@WebServlet("/ELServlet")
public class ELServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ELServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name="Su Su";
		request.setAttribute("reqName", name);
		
		int[] number = {1,2};
		request.setAttribute("reqNumber", number);
		
		List<Student> studList = new ArrayList<Student>();
		studList.add(new Student(1, "Ag Ag"));
		request.setAttribute("reqList", studList);
		
		Student obj = new Student(2,"Mg Mg");
		request.setAttribute("reqObj", obj);
		
		Map<String, String> map =new HashMap<String, String>();
		map.put("1", "AA");
		map.put("2", "BB");
		request.setAttribute("reqMap", map);
		
		request.getRequestDispatcher("eltest.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
