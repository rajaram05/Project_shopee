package co.in.project_shoppee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public cookies() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie [] cookies = request.getCookies();
		boolean flag = false;
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if("loginusername".equals(cookie.getName())) {
					flag = true;
					break;
				}
			}
		}
		if(flag) {
			response.sendRedirect("home.jsp");
		}
		else {
			response.sendRedirect("login.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
