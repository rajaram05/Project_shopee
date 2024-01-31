package co.in.project_shoppee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServelet
 */
public class loginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public loginServelet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
	    String uname = request.getParameter("username");
	    String pass= request.getParameter("password");
	    			
				try {
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "admin");
			// Statement stmt=con.createStatement()
				PreparedStatement ps= con.prepareStatement("Select USER_NAME from Users where USER_NAME=? and PASSWORD=?");
			    ps.setNString(2,uname);
			    ps.setNString(3, pass);
			    ResultSet rs= ps.executeQuery();
			    
			    if(rs.next()) {
//			    	Cookie ck= new Cookie(uname, pass);
//			    	response.addCookie(ck);
//			    	RequestDispatcher rd= request.getRequestDispatcher("home.html");
//			    	rd.include(request, response);
			    out.write("your Login is successfully, Welcome " +uname);
			    }
			    else {
			    	request.getRequestDispatcher("/home.html").forward(request, response);
			    	
			    	
			    }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response.sendRedirect("home.html");
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
