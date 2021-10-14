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
        
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        AccountServices accountServices = new AccountServices();
        HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        

        if(username == null || username.equals("") || password == null || password.equals("")) {
            request.setAttribute("invalidInput", "Failed authentication");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
            
        } else if (accountServices.login(username, password) == null) {
            request.setAttribute("invalidLogin", "Failed authentication");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        }
        
        if (accountServices.login(username, password) != null) {
            //saving variable in a session variable
            session.setAttribute("usernameSession", username);

            //redirecting
            response.sendRedirect("/MyLogin/home");
        }

        return;
    }

}
