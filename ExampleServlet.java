package exampleServlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ExampleServlet") // path for servlet, should match the xml configs
public class ExampleServlet extends HttpServlet // java class processed on server, inherit http servlet class
{
	private static final long serialVersionUID = 1L; // serialisable class version identifier
	// override inherited doget method, the jsp form will calls this
	// request object - form data coming in from browser
	// response object - data being sent back to the browser
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html"); // set content data type being sent back to the browser
		PrintWriter out = response.getWriter(); // create print writer object via response object
		out.println("<html>"); // create on the fly http content being sent back to the browser
		out.println("<body>");
		out.println("<h1>");
		out.println("hello " + request.getParameter("firstname") + " " + request.getParameter("lastname")); // get parameters from request object which was set via the jsp form
		out.println("<hr />");
		out.println(new java.util.Date()); // create date object to print the date
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	// override inherited dopost method, alternative http request method, this is a bit safer as doesn't store parameters in browser history or server logs
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//doGet(request, response); // this just calls the doget method, so would do exactly the same
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test"); // just testing the alternative method
	}
}
