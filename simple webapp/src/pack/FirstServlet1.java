package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet1
 */
public class FirstServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int i=0;
	private int j=0;
	
  
    public FirstServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		i++;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		j++;
		PrintWriter pw=response.getWriter();
		System.out.println("do Get() is called");
		pw.print("<html><body>");
		pw.print("<p> Value of i "+i+"Value of j"+j+"</p></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		j++;
		PrintWriter pw=response.getWriter();
		System.out.println("do Get() is called");
		pw.print("<html><body>");
		pw.print("<p> Value of i "+i+"Value of j"+j+"</p></body></html>");
		
	}

}
