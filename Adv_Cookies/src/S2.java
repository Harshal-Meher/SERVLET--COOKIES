

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class S2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//array cookies create a obj
	Cookie[] cookies = request.getCookies();
	
	boolean f=false;
	String name="";
	
	response.setContentType("text/html");
    PrintWriter out=response.getWriter();  
    
	
	if(cookies==null)
	{
		out.print("sorry...");
		return;
	}
	else
	{
		for(Cookie c: cookies)
		{
			String tname=c.getName();
			
			if(tname.equals("uname"))
			{
				f=true;
				name=c.getValue();
				out.print("<h1>Welcome Servlet 2 "+ name +"</h1>");
			}
		}
	}
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
