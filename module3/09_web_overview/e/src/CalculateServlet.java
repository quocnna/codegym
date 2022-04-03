import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String des= request.getParameter("des");
        Double price= Double.parseDouble(request.getParameter("price"));
        Double discount= Double.parseDouble(request.getParameter("discount"));

        double amount= price* discount* 0.01;
        double priceAfterDiscount= price- amount;
        PrintWriter printWriter= response.getWriter();
        printWriter.print("<html>");
        printWriter.print("<h2>"+ des+ "</h2>");
        printWriter.print("<h2> Amount: "+ amount+ "</h2>");
        printWriter.print("<h2> Price after discount: "+ priceAfterDiscount+ "</h2>");
        printWriter.print("</html>");
    }
}
