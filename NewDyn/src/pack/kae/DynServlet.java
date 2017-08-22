package pack.kae;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exapp.kk.Bean1;

/**
 * Servlet implementation class DynServlet
 */
@WebServlet("/DynServlet")
public class DynServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB
    Bean1 bean1;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Entering DynServlet doGet method...");
	PrintWriter out= response.getWriter();
	out.println(bean1.beanMethod());
	System.out.println("Exiting DynServlet doGet Method...Peace");
	}

	
	}


