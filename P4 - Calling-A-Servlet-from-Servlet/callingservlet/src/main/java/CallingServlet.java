
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/callingservlet")

public class CallingServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        int prod = (int) req.getAttribute("product");
        // int sum = (int) req.getAttribute("sum");

        // res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("Hello Guys");
        out.println("<h1>The product value is</h1>" + prod + "\n");
        // out.println("<h1>The sum of two is </h1>" + sum + "\n" + "The product is" +

    }
}
