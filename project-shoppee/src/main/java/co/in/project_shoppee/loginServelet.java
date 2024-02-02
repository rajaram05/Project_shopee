package co.in.project_shoppee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;

//import javax.servlet.RequestDispatcher;
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
	    String uname = request.getParameter("loginusername");
	    String pass= request.getParameter("loginpassword");
	    			
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ecommerce", "root", "0000");) {
		   
		    PreparedStatement ps = con.prepareStatement("select username from CustomerDetails where UserName = ? and Password =?");

		    ps.setString(1, uname);
		    ps.setString(2, pass);

		    ResultSet rs = ps.executeQuery();
		    
		    if (rs.next()){
		        response.sendRedirect("home.html");
		    } else {
		        out.print("Username or password is incorrect");
		        response.sendRedirect("login.html");
		    }

		} catch (SQLException e) {
		    e.printStackTrace();
		    out.write("Error in creation");
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//doGet(request, response);
	}

}
