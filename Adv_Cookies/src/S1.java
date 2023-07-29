

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s1")
public class S1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();   
	    
	    String name=request.getParameter("uname");
	    out.print("<h1>Hello, " + name+"  Welcome to servlet one</h1> <a href='s2'>Servlet2</a>");
		
	    //Create cookies
	    
	   Cookie c=new Cookie("uname" ,name);
	   response.addCookie(c);
	
	}
	
	}

