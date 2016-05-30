package tw.edu.mis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.log("### doGet ###");
		//初始化參數 init-param
		this.log(this.getInitParameter("babyface"));
		this.log(this.getInitParameter("jojohoho"));
		//上下文參數 context-param
		this.log(this.getServletContext().getInitParameter("allServlet"));
		
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>HelloServlet</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<H1>HelloServlet</H1>");
		out.println("<P>HelloServlet</P>");
		out.println("<P>babyface: " + this.getInitParameter("babyface") + "</P>");
		out.println("<P>jojohoho: " + this.getInitParameter("jojohoho") + "</P>");
		out.println("<P>allServlet: " + this.getServletContext().getInitParameter("allServlet") + "</P>");
		out.println("</BODY>");
		out.println("</HTML>");
		
		out.flush();
		out.close();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.log("### doPost ###");
	}
	
}
