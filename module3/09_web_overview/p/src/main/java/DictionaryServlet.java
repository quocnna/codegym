import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", urlPatterns = "/translate")
public class DictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String word= request.getParameter("txtSearch");

        Map<String, String> dictionary= new HashMap<>();
        dictionary.put("hello", "xin chao");
        dictionary.put("world", "the gioi");
        dictionary.put("love", "tinh yeu");
        dictionary.put("happy", "hanh phuc");

        PrintWriter printWriter= response.getWriter();
        String res= dictionary.get(word);
        String tmp= "<html><h1>%s</h1></html>";
        if(res != null){
            printWriter.printf(tmp, word + "= " + res);
        }
        else {
            printWriter.printf(tmp, "Not found");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
