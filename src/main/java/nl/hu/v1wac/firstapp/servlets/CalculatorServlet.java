package nl.hu.v1wac.firstapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/CalculatorServlet.do")
public class CalculatorServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String getal1 = req.getParameter("getal1");
		String getal2 = req.getParameter("getal2");
		String op = req.getParameter("operator");
		int g1 = Integer.parseInt(getal1);
		int g2 = Integer.parseInt(getal2);
		
		
		PrintWriter pw = resp.getWriter();
		
		resp.setContentType("text/html");
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println(" <title>Calculator</title>");
		pw.println(" <body>");
		if (op.equals("plus")) {
			pw.println("  <h2>Resultaat: <br>Opgeteld: "+ (g1 + g2) + "</h2>");
		} 
		else if (op.equals("min")) {
			pw.println("  <h2>Resultaat: <br>Afgetrokken: "+ (g1 - g2) + "</h2>");
		} 
		else if (op.equals("delen")) {
			pw.println("  <h2>Resultaat: <br>Gedeeld: "+ (g1/g2) + "</h2>");
		} 
		else if (op.equals("keer")) {
			pw.println("  <h2>Resultaat: <br>Vermenigvuldigd: "+ (g1*g2) + "</h2>");
		}
		pw.println(" </body>");
		pw.println("</html>");
		
	}

}
