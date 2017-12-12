import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/First")
public class Sample extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private String ganesh;

	public void init(ServletConfig config) {
		 ganesh = "Welocme 2 Brahmeswaram";
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body bgcolor='lightblue'><br><br>");
		out.println("<h1>Sure Ganesh Reddy</h1>");
		out.println("<h1>"  +  ganesh + "</h1>");
		out.println("</body></html>");
		
	}

}
