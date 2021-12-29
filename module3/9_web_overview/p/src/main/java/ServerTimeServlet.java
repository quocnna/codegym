import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//@javax.servlet.annotation.WebServlet(name = "ServerTimeServlet", urlPatterns = "/time")
public class ServerTimeServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter printWriter= response.getWriter();
        printWriter.printf("<html>Time now: %s</html>", new Date());
    }
}
