import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user= request.getParameter("username");
        String pass= request.getParameter("password");

        PrintWriter printWriter= response.getWriter();
        String res= "<html><h1>%s</h1></html>";
        if("admin".equals(user) && "admin".equals(pass)){
            printWriter.printf(res, "Welcome " + user);
        }
        else {
            printWriter.printf(res, "Login Error");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
