package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.AccountServices;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false);
        AccountServices accountServices = new AccountServices();
        
        String logOutButton = request.getParameter("login");
        String homeUsername = request.getParameter("homeUsername");
        String url = "/MyLogin/home";

        if(logOutButton != null) {
            session.invalidate();
        }
        
        
//          if(session == null) {
//              session = request.getSession();
//          } else {
//              //redirecting
//                response.sendRedirect("/MyLogin/home");
//          }
          
              

            
        
    }

}
