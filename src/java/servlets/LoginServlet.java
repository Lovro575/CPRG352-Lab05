package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.AccountServices;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        AccountServices accountServices = new AccountServices();
         HttpSession session = request.getSession();
        
        String username;
        String password;
        
        username = request.getParameter("username");
        password = request.getParameter("password");
        
        if(username == null || username.equals("") || password == null || password.equals("")) {
            accountServices.login(username, password);
            if(accountServices != null) {
            //might be wrong
            session.getAttribute("username");
            }
        }
        
    }

}
