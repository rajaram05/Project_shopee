package co.in.project_shoppee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class createServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ecommerce", "root", "0000");) {
		    String fullname = request.getParameter("fullname");
		    String username = request.getParameter("username");
		    String mail = request.getParameter("mail");
		    String phone = request.getParameter("phone");
		    String password = request.getParameter("password");
		    String conpassword = request.getParameter("conpassword");
		    String birth = request.getParameter("birth");
		    String gender = request.getParameter("gender");
		    String recovery = request.getParameter("recovery");
		    
		    if(password.equals(conpassword)) {
		    PreparedStatement ps = con.prepareStatement("insert into CustomerDetails (FullName, UserName, MailId, Phone_Number, Password, ConfirmPassword, dob, gender, recovery) values (?,?,?,?,?,?,?,?,?)");

		    ps.setString(1, fullname);
		    ps.setString(2, username);
		    ps.setString(3, mail);
		    ps.setString(4, phone);
		    ps.setString(5, password);
		    ps.setString(6, conpassword);
		    ps.setString(7, birth);
		    ps.setString(8, gender);
		    ps.setString(9, recovery);
		    
			    int count = ps.executeUpdate();
		    	if (count != 0) {
		    		response.sendRedirect("login.html");
		    		}else {
                        pw.print("<script>alert('Login Failed! Try Again...');");
                        pw.print("window.location.href='create_page.html';");
                        pw.print("</script>");
                        }
		    }
		    	else {
		    			pw.print("<script>alert('Passwords do not match. Please try again...');");
		    			pw.print("window.location.href='create_page.html';");
                        pw.print("</script>");
		    		}
		} catch (SQLException e) {
		    e.printStackTrace();
		    pw.write("Error in creation");
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
