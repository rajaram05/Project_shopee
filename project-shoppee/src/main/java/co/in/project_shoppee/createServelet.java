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
		try {
			PrintWriter pw = null;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CustomerDetails", "root", "0000");
			String fullname = request.getParameter("fullname");
			String username = request.getParameter("username");
			String mail = request.getParameter("mail");
			String phone = request.getParameter("phone");
			String password = request.getParameter("password");
			String conpassword = request.getParameter("conpassword");
			String birth = request.getParameter("birth");
			String gender = request.getParameter("gender");
			String recovery = request.getParameter("recovery");
			PreparedStatement ps = con.prepareStatement("insert into logintable (fullname, username, mail, phone, password, conpassword, birth, gender, recovery) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(2, fullname);
			ps.setString(3, username);
			ps.setString(4, mail);
			ps.setString(5, phone);
			ps.setString(6, password);
			ps.setString(7, conpassword);
			ps.setString(8, birth);
			ps.setString(9, gender);
			ps.setString(10, recovery);
			ps.executeUpdate();
			response.sendRedirect("login.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
